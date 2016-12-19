package com.sbk.ios.gifts.giver.service.impl;

import com.sbk.ios.gifts.giver.domain.ActiveCode;
import com.sbk.ios.gifts.giver.domain.Game;
import com.sbk.ios.gifts.giver.mapper.ActiveCodeMapper;
import com.sbk.ios.gifts.giver.service.IActiveCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActiveCodeServiceImpl implements IActiveCodeService {
	@Autowired
	private ActiveCodeMapper activeCodeMapper;
	@Override
	public void update(ActiveCode activeCode) {
		int ret = this.activeCodeMapper.updateByPrimaryKey(activeCode);
		if (ret == 0) {
			throw new RuntimeException("系统繁忙,请稍后重试" );
		}
	}

}
