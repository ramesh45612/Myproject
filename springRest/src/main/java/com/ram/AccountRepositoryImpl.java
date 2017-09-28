package com.ram;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl {


	public ClintAccountLockDTO updateLockStatus(ClintAccountLockDTO clintAccountLockDTO) {

		if(clintAccountLockDTO.getAction().equalsIgnoreCase("edit")){
			if(clintAccountLockDTO.getLockStatus()==false){
				clintAccountLockDTO.setLockStatus(true);
			}
		}
		
		else{
			clintAccountLockDTO.setLockedByUser(null);	
		}
			
		return clintAccountLockDTO;
	}

}
