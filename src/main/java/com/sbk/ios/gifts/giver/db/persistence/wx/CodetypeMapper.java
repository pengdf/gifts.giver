/*
 * CodetypeMapper.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.persistence.wx;

import com.sbk.ios.gifts.giver.db.model.wx.Codetype;
import com.sbk.ios.gifts.giver.db.model.wx.CodetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodetypeMapper {
    int countByExample(CodetypeExample example);

    int deleteByExample(CodetypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Codetype record);

    int insertSelective(Codetype record);

    List<Codetype> selectByExample(CodetypeExample example);

    Codetype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Codetype record, @Param("example") CodetypeExample example);

    int updateByExample(@Param("record") Codetype record, @Param("example") CodetypeExample example);

    int updateByPrimaryKeySelective(Codetype record);

    int updateByPrimaryKey(Codetype record);
}