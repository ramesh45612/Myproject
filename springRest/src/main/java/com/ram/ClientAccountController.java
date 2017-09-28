package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientAccountController {

	@Autowired
	ClientAccountQueryServiceImpl clientAccountQueryService;
	
	@Autowired
	AccountServiceImpl accountServiceImpl;

	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public ClintAccountLockDTO edit(@RequestParam("accountNumber") String accountNumber,
			@RequestParam("action") String action) {
		ClintAccountLockDTO clintAccountLockDTO = null;
		clintAccountLockDTO = clientAccountQueryService.getClientLockStatus(accountNumber);
		clintAccountLockDTO = accountServiceImpl.updateLockStatus(clintAccountLockDTO);
		return clintAccountLockDTO;

	}
	
	@RequestMapping(value="/create",method = RequestMethod.GET)
	public NewJoineeDTO create(@RequestParam("accountNumber") String accountNumber) {
		NewJoineeDTO newJoineeDTO = null;
		newJoineeDTO = clientAccountQueryService.getNewJoineeDetails(accountNumber);
		return newJoineeDTO;

	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public NewJoineeDTO update(@RequestBody NewJoineeCommand command){
		return null;
	}
}
