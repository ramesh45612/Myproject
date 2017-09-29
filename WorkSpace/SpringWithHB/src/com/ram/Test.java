package com.ram;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
UserDao ob = new UserDao();
User u = new User("1", "1", "1");

ob.register(u);
	}

}
