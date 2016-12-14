/*
 * GifttypeMapper.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.persistence.wx;

import com.sbk.ios.gifts.giver.db.model.wx.Gifttype;
import com.sbk.ios.gifts.giver.db.model.wx.GifttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GifttypeMapper {
    int countByExample(GifttypeExample example);

    int deleteByExample(GifttypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Gifttype record);

    int insertSelective(Gifttype record);

    List<Gifttype> selectByExample(GifttypeExample example);

    Gifttype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Gifttype record, @Param("example") GifttypeExample example);

    int updateByExample(@Param("record") Gifttype record, @Param("example") GifttypeExample example);

    int updateByPrimaryKeySelective(Gifttype record);

    int updateByPrimaryKey(Gifttype record);
}