/*
 * PhoneMapper.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.persistence.wx;

import com.sbk.ios.gifts.giver.db.model.wx.Phone;
import com.sbk.ios.gifts.giver.db.model.wx.PhoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneMapper {
    int countByExample(PhoneExample example);

    int deleteByExample(PhoneExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Phone record);

    int insertSelective(Phone record);

    List<Phone> selectByExample(PhoneExample example);

    Phone selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Phone record, @Param("example") PhoneExample example);

    int updateByExample(@Param("record") Phone record, @Param("example") PhoneExample example);

    int updateByPrimaryKeySelective(Phone record);

    int updateByPrimaryKey(Phone record);
}