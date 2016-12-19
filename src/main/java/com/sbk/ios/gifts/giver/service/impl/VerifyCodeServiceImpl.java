package com.sbk.ios.gifts.giver.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sbk.ios.gifts.giver.domain.ActiveCode;
import com.sbk.ios.gifts.giver.domain.GiftPage;
import com.sbk.ios.gifts.giver.domain.Phone;
import com.sbk.ios.gifts.giver.mapper.ActiveCodeMapper;
import com.sbk.ios.gifts.giver.mapper.GiftPageMapper;
import com.sbk.ios.gifts.giver.mapper.PhoneMapper;
import com.sbk.ios.gifts.giver.service.IActiveCodeService;
import com.sbk.ios.gifts.giver.service.IGiftPageService;
import com.sbk.ios.gifts.giver.service.IPhoneService;
import com.sbk.ios.gifts.giver.service.IVerifyCodeService;
import com.sbk.ios.gifts.giver.util.DateUtil;
import com.sbk.ios.gifts.giver.util.JSONResult;
import com.sbk.ios.gifts.giver.util.VerifyCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class VerifyCodeServiceImpl implements IVerifyCodeService {
	
	@Autowired
	private PhoneMapper phoneMapper;
	@Autowired
	private ActiveCodeMapper activeCodeMapper;
	@Autowired
	private GiftPageMapper giftPageMapper;
	@Autowired
	private IGiftPageService giftPageService;
	@Autowired
	private IPhoneService phoneService;
	@Autowired
	private IActiveCodeService activeCodeService;
	

	// VALUE标签可以用来注入简单值
	@Value("${sms.username}")
	private String username;
	@Value("${sms.password}")
	private String password;
	@Value("${sms.apikey}")
	private String apikey;
	@Value("${sms.url}")
	private String url;

	public void sendVerifyCode(String phoneNumber,String cookieNumber) {
		//查询是否有该手机号存在,如果存在,查询出上次发送手机验证码时间
		Phone content = phoneMapper.selectByPhoneNum(phoneNumber);
		if (content == null // 没有发过
				|| (content != null && DateUtil.getBetweenSecond(content.getSendTime(),// 如果发送过，要判断当前时间和上次发送时间的间隔时间
						new Date()) >=4)) {
			// 生成一个验证码
			String code = VerifyCodeUtil.getCode();
			System.out.println(code);
			System.out.println(cookieNumber);
			// 发送短信
			/*
			 * System.out.println("发送一条短信给"+phoneNumber+"内容:验证码是"+code+
			 * ",有效时间"+BidConst.VERIFYCODE_VALID_TIME+"秒");
			 */

			// 发送短信，短信发送成功了
			try {
				
				// 发送成功
				//if (response.startsWith("success")) {
					
					Phone phone = new Phone();
					//查询表中是否存在该手机对象
					//如果存在,更新验证码
					if (content!=null) {
						phone.setId(content.getId());
						phone.setPhoneNumber(phoneNumber);
						phone.setCookieNumber(cookieNumber);
						phone.setSendTime(new Date());
						phone.setVerifyCode(code);
						phone.setActiveState(content.getActiveState());
						System.out.println("1");
						phoneService.update(phone);
						System.out.println("2");
					}else{
						//如果不存在,将对象保存进表里面,设置为未激活状态
						phone.setPhoneNumber(phoneNumber);
						phone.setCookieNumber(cookieNumber);
						phone.setSendTime(new Date());
						phone.setVerifyCode(code);
						phone.setActiveState(0);
						phoneMapper.insert(phone);
						System.out.println("3");
					}
					
					
//				} else {
//					throw new RuntimeException();
//				}
			} catch (Exception e) {
				throw new RuntimeException("发送短信失败");
			}
		} else {
			throw new RuntimeException("发送过于频繁!");
		}
	}
	
	public List<Map<String,List>> bindPhone(String phoneNumber, String verifyCode,String cookieNumber) {
		// 1,做验证码的校验
		if (this.validate(phoneNumber, verifyCode,cookieNumber)) {
			List list = new ArrayList<>();
			Map map = new HashMap<>();
			//查询该手机对象状态码
			Phone phone = phoneMapper.selectByPhoneNum(phoneNumber);
			//如果是激活状态,根据手机号码从激活码对象查询出该手机不同礼包的激活码并显示出来
			if (phone.getPhoneNumber()!=null && phone.getActiveState()==1){
				List<ActiveCode> activeCodeList = activeCodeMapper.selectByPhoneNum(phoneNumber);
				map.put("activeCodeList", activeCodeList);
				Long gameId = 1L;
				List<GiftPage> pageList = giftPageMapper.selectByGameId(gameId);
				for (GiftPage giftPage : pageList) {
					int giftNums = activeCodeMapper.selectNumByCodeType(giftPage.getCodeType().getId());
					int giftTotals = activeCodeMapper.selectNumByCodeTypeAll(giftPage.getCodeType().getId());
					BigDecimal  giftNum =new BigDecimal (giftNums);
					BigDecimal  giftTotal =new BigDecimal (giftTotals);
					giftPage.setGiftTotal(giftTotal);
					giftPage.setGiftNum(giftNum);
					giftPageService.update(giftPage);
				}
				map.put("pageList", pageList);
				list.add(map);
				return list;
			}else{
				Long gameId = 1L;
				List<GiftPage> fistPages = giftPageService.selectByGameId(gameId);
				map.put("fistPages", fistPages);
				System.out.println("5");
				//如果是未激活状态,从激活码表中随机不重复查询出不同礼包的验证码对象,
				List<ActiveCode> activeCodeList = activeCodeMapper.selectRandByCodeType();
				//将手机号码更新到查询出来的激活码对象中,将激活码对象状态变为已查询状态(状态码为1)
				System.out.println("activeCodeList:"+activeCodeList);
				for(ActiveCode activeCode : activeCodeList){
					System.out.println("activeCode:"+activeCode.getActiveCode());
					activeCode.setCodeType(activeCode.getCodeType());
					activeCode.setPhoneNumber(phoneNumber);
					activeCode.setChartState(1);
					activeCodeService.update(activeCode);
				}
				//将查询出来的激活码对象集合放到Map中
				map.put("activeCodeList", activeCodeList);
				//将手机对象状态改为激活状态
				phone.setSendTime(new Date());
				phone.setActiveState(1);
				phoneService.update(phone);
				System.out.println("6");
				//获取礼包对象,将礼包数量减去1
				
				List<GiftPage> pageList = giftPageMapper.selectByGameId(gameId);
				
				for (GiftPage giftPage : pageList) {
					int giftNums = activeCodeMapper.selectNumByCodeType(giftPage.getCodeType().getId());
					int giftTotals = activeCodeMapper.selectNumByCodeTypeAll(giftPage.getCodeType().getId());
					BigDecimal  giftNum =new BigDecimal (giftNums);
					BigDecimal  giftTotal =new BigDecimal (giftTotals);
					giftPage.setGiftTotal(giftTotal);
					giftPage.setGiftNum(giftNum);
					System.out.println("7");
					giftPageService.update(giftPage);
					System.out.println("8");
				}
				System.out.println("9");
				
				System.out.println("11");
				//查询出所有礼包信息,查询出激活码对象信息 放到map中
				map.put("pageList", pageList);
				List nums=new ArrayList<>();
				for (GiftPage giftPage : fistPages) {
					int giftNum = giftPage.getGiftNum().intValue();
					if (giftNum!=0) {
						System.out.println(giftNum);
						nums.add(giftNum);
					}
				}
				JSONResult json = new JSONResult();
				System.out.println(nums);
				if (nums.isEmpty()){
					System.out.println("10");
					json.setSuccess(false);
					json.setMsg("礼包领取完毕,下次请赶早");
					map.put("json", json);
				}else{
					json.setSuccess(true);
					json.setMsg(null);
					map.put("json", json);
					
				}
				list.add(map);
				return list;
			}
		} else {
			throw new RuntimeException("验证码校验失败");
		}
	}
	
	

	public boolean validate(String phoneNumber, String verifyCode,String cookieNumber) {
		Phone content = phoneMapper.selectByPhoneNum(phoneNumber);
		return content != null// 发了验证码
				&& content.getPhoneNumber().equals(phoneNumber)// 两次电话相同
				&& content.getVerifyCode().equalsIgnoreCase(verifyCode)// 两次验证码相同
				&& content.getCookieNumber().equals(cookieNumber)// 两次cookie值相同
				/*&& DateUtil.getBetweenSecond(content.getSendTime(), new Date()) <= 4*/;// 短信在有效期之内
	}
}
