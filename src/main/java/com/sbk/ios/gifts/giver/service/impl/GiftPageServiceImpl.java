package com.sbk.ios.gifts.giver.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.sbk.ios.gifts.giver.domain.GiftPage;
import com.sbk.ios.gifts.giver.mapper.ActiveCodeMapper;
import com.sbk.ios.gifts.giver.mapper.GiftPageMapper;
import com.sbk.ios.gifts.giver.service.IGiftPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GiftPageServiceImpl implements IGiftPageService {
	@Autowired
	private GiftPageMapper giftPageMapper;
	@Autowired
	private ActiveCodeMapper activeCodeMapper;

	@Override
	public GiftPage selectByPrimaryKey(Long id) {
		GiftPage giftPage = giftPageMapper.selectByPrimaryKey(id);
		return giftPage;
		
	}

	@Override
	public List<GiftPage> selectByGameId(Long gameId) {
		List<GiftPage> list = giftPageMapper.selectByGameId(gameId);
		for (GiftPage giftPage : list) {
			int giftNums = activeCodeMapper.selectNumByCodeType(giftPage.getCodeType().getId());
			int giftTotals = activeCodeMapper.selectNumByCodeTypeAll(giftPage.getCodeType().getId());
			BigDecimal  giftNum =new BigDecimal (giftNums);
			BigDecimal  giftTotal =new BigDecimal (giftTotals);
			giftPage.setGiftTotal(giftTotal);
			giftPage.setGameType(giftPage.getGameType());
			giftPage.setGiftNum(giftNum);
			giftPageMapper.updateByPrimaryKey(giftPage);
		}
		return list;
	}

	@Override
	public void update(GiftPage giftPage) {
		int ret = this.giftPageMapper.updateByPrimaryKey(giftPage);
		if (ret == 0) {
			throw new RuntimeException("系统繁忙,请稍后重试");
		}
		
	}

}
