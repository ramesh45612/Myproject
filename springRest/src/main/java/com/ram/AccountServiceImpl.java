package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl {

	@Autowired
	AccountRepositoryImpl  accountRepositoryImpl;
	public ClintAccountLockDTO updateLockStatus(ClintAccountLockDTO clintAccountLockDTO) {
		clintAccountLockDTO = accountRepositoryImpl.updateLockStatus(clintAccountLockDTO);
		return clintAccountLockDTO;
	}
	
	

}
