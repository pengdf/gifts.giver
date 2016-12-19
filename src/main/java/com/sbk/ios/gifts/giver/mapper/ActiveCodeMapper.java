package com.sbk.ios.gifts.giver.mapper;

import com.sbk.ios.gifts.giver.domain.ActiveCode;
import com.sbk.ios.gifts.giver.domain.Game;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface ActiveCodeMapper {
	int insert(ActiveCode activecode);


	int updateByPrimaryKey(ActiveCode activecode);

	List<ActiveCode> selectRandByCodeType();
	
	List<ActiveCode> selectByPhoneNum(String phoneNumber);
	
	int selectNumByCodeType(Long codeTypeId);
	
	int selectNumByCodeTypeAll(Long codeTypeId);

}
