package com.ram.adminlte.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.adminlte.dao.User_Dao;
import com.ram.adminlte.model.DownloadList;
import com.ram.adminlte.model.Links;
import com.ram.adminlte.model.Operators;
import com.ram.adminlte.model.StateMaster;
import com.ram.adminlte.model.User;
import com.ram.adminlte.model.Users;

@Service
public class User_Service {
	
	@Autowired
	private User_Dao user_Dao;
	
	public boolean register(User user)
	{
		Serializable id=user_Dao.register(user);
		if(id!=null)
			return true;
		else
			return false;
		
	}
	
	public Users addUser(Users users)
	{
		
		return user_Dao.addUser(users);
		
		
	}
	
	public void update(Users users) {
		user_Dao.update(users);
	}
	
	public List<StateMaster> getState()
	{
		
		return user_Dao.getState();
	}
	
	public List<Users> userList()
	{
		List<Users>list=user_Dao.userList();
		return list;
	}
	
	public Users getByID(int id) {
		return user_Dao.getUsers(id);
	}
	
	public void deleteUser(int id) {
		user_Dao.deleteUser(id);
	}

	public void deleteSelected(int[] ids) {
		user_Dao.deleteSelected(ids);
		
	}

	public StateMaster getStateByID(int sid) {
		return user_Dao.getStateByID(sid);
	}

	public List<DownloadList> showDownloadlist() {
		return user_Dao.showDownloadlist();
	}


	public List<Links> showlistoflinks() {
		return user_Dao.showlistoflinks();
	}

	public List<Operators> showlistofoperators() {
		return user_Dao.showlistofoperators();
	}

	
	}
