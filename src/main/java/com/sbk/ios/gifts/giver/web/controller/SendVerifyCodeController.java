package com.sbk.ios.gifts.giver.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sbk.ios.gifts.giver.service.IVerifyCodeService;
import com.sbk.ios.gifts.giver.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 发送验证码控制器
 * 
 * @author Administrator
 * 
 */
@Controller
public class SendVerifyCodeController {

	@Autowired
	private IVerifyCodeService verifyCodeService;

	/**
	 * 发送验证码
	 * 
	 * @param phoneNumber
	 * @return
	 */
	@RequestMapping("sendVerifyCode")
	@ResponseBody
	public JSONResult sendVerifyCode(String phoneNumber, String cookieNumber) {
		JSONResult json = new JSONResult();
		try {
			this.verifyCodeService.sendVerifyCode(phoneNumber, cookieNumber);
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg(e.getMessage());
		}
		return json;
	}

	/**
	 * 点击领取礼包 手机号,验证码核对,获取激活码
	 */
	@RequestMapping("check")
	@ResponseBody
	public List<Map<String, List>> bindPhone(String phoneNumber,
			String verifyCode, String cookieNumber) {

		List<Map<String, List>> listAll = this.verifyCodeService.bindPhone(
				phoneNumber, verifyCode, cookieNumber);
		return listAll;
	}
}
