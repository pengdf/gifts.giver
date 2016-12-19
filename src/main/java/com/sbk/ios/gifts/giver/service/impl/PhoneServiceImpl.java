package com.sbk.ios.gifts.giver.service.impl;

import com.sbk.ios.gifts.giver.domain.Phone;
import com.sbk.ios.gifts.giver.mapper.PhoneMapper;
import com.sbk.ios.gifts.giver.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PhoneServiceImpl implements IPhoneService {
	@Autowired
	private PhoneMapper phoneMapper;
	@Override
	public void update(Phone phone) {
		int ret = phoneMapper.updateByPhoneNum(phone);
		if (ret == 0) {
			throw new RuntimeException("系统繁忙,请稍后重试" );
		}
		
	}
	
}
