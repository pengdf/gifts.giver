package com.sbk.ios.gifts.giver.service;

import com.sbk.ios.gifts.giver.domain.GiftPage;

import java.util.List;


public interface IGiftPageService {
	void update(GiftPage giftPage);
	
	GiftPage selectByPrimaryKey(Long id);
	
	List<GiftPage> selectByGameId(Long gameId);
}
