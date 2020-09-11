package com.ram.adminlte.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.adminlte.dao.LoginDao;
import com.ram.adminlte.model.User;

@Service // @Component//@Cpnfiguration
public class LoginService {

	@Autowired
	LoginDao loginDao;

	public boolean checkLogin(User user) {
		User user2 = loginDao.checkUser(user);
		if (user2 != null) {
			return true;
		} else {
			return false;
		}
	}


	public boolean registerUser(User user) {
		return false;
			
	

	}
	
	
}
