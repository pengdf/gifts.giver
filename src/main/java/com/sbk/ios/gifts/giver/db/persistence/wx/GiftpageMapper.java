/*
 * GiftpageMapper.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.persistence.wx;

import com.sbk.ios.gifts.giver.db.model.wx.Giftpage;
import com.sbk.ios.gifts.giver.db.model.wx.GiftpageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftpageMapper {
    int countByExample(GiftpageExample example);

    int deleteByExample(GiftpageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Giftpage record);

    int insertSelective(Giftpage record);

    List<Giftpage> selectByExample(GiftpageExample example);

    Giftpage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Giftpage record, @Param("example") GiftpageExample example);

    int updateByExample(@Param("record") Giftpage record, @Param("example") GiftpageExample example);

    int updateByPrimaryKeySelective(Giftpage record);

    int updateByPrimaryKey(Giftpage record);
}