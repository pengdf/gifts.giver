/*
 * GameMapper.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.persistence.wx;

import com.sbk.ios.gifts.giver.db.model.wx.Game;
import com.sbk.ios.gifts.giver.db.model.wx.GameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameMapper {
    int countByExample(GameExample example);

    int deleteByExample(GameExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Game record);

    int insertSelective(Game record);

    List<Game> selectByExample(GameExample example);

    Game selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKey(Game record);
}