package com.sbk.ios.gifts.giver.mapper;

import com.sbk.ios.gifts.giver.domain.GiftPage;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GiftPageMapper {
	
	int updateByPrimaryKey(GiftPage giftPage);

	GiftPage selectByPrimaryKey(Long id);
    
    List<GiftPage> selectByGameId(Long gameId);

}
