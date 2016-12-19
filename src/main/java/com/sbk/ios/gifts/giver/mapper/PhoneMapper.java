package com.sbk.ios.gifts.giver.mapper;


import com.sbk.ios.gifts.giver.domain.Phone;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneMapper {
	int insert(Phone phone);

	Phone selectByPhoneNum(String phoneNumber);

	int updateByPhoneNum(Phone phone);
}
