package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDao loginDAO;

	   public void setLoginDAO(LoginDao loginDAO) {
             this.loginDAO = loginDAO;
      }
     
      public boolean checkLogin(String userName, String userPassword){
             System.out.println("In Service class...Check Login");
             return loginDAO.checkLogin(userName, userPassword);
      }


}
