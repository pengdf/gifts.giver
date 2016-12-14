/*
 * ActivecodeMapper.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.persistence.wx;

import com.sbk.ios.gifts.giver.db.model.wx.Activecode;
import com.sbk.ios.gifts.giver.db.model.wx.ActivecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivecodeMapper {
    int countByExample(ActivecodeExample example);

    int deleteByExample(ActivecodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Activecode record);

    int insertSelective(Activecode record);

    List<Activecode> selectByExample(ActivecodeExample example);

    Activecode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Activecode record, @Param("example") ActivecodeExample example);

    int updateByExample(@Param("record") Activecode record, @Param("example") ActivecodeExample example);

    int updateByPrimaryKeySelective(Activecode record);

    int updateByPrimaryKey(Activecode record);
}