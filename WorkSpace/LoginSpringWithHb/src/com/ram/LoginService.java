package com.ram;

/*Service class is called in the controller class which in turns calls the methods of DAO classes for validating the user*/

public interface LoginService {

 public boolean checkLogin(String userName, String userPassword);

}
