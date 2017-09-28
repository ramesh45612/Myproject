package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientAccountQueryServiceImpl {

	@Autowired
	ClientAccountQueryRepositoryImpl ClientAccountQueryRepository;
	public ClintAccountLockDTO getClientLockStatus(String accountNumber) {
		
		ClintAccountLockDTO clintAccountLockDTO =null;
		clintAccountLockDTO = ClientAccountQueryRepository.getClientLockStatus(accountNumber);
		return clintAccountLockDTO;
		
	}
	public NewJoineeDTO getNewJoineeDetails(String accountNumber) {
		NewJoineeDTO newJoineeDTO =null;
		newJoineeDTO = ClientAccountQueryRepository.getNewJoineeDetails( accountNumber) ;
		return newJoineeDTO;
	}
 
}
