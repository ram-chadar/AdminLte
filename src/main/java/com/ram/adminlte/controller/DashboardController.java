package com.ram.adminlte.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ram.adminlte.model.DownloadList;
import com.ram.adminlte.model.Links;
import com.ram.adminlte.model.Operators;
import com.ram.adminlte.model.Users;
import com.ram.adminlte.service.User_Service;

@Controller
public class DashboardController {

	@Autowired
	private User_Service userService;
	
	@RequestMapping(value="/userspage")
	public ModelAndView userspage( Model model)
	{
		List<Users>users=userService.userList();
		System.out.println(users+"*********************");
		
		return new ModelAndView("users","userList",users);
	}
	
	@RequestMapping(value="/dashboard")
	public ModelAndView dashboard()
	{
		return new ModelAndView("dashboard");
	}
	
	
	@RequestMapping(value="/operators")
	public ModelAndView operatorspage()
	{
		ModelAndView mv = new ModelAndView();
		if(userService.showDownloadlist()!=null) {
			List<Operators> l = userService.showlistofoperators();
			mv.setViewName("operators");
			mv.addObject("data", userService.showlistofoperators());
		}else {
			mv.addObject("msg", "List not available");
			mv.setViewName("operators");
	}
		return mv;
	}
	@RequestMapping(value="/downloads")
	public ModelAndView downloadpage()
	{
		ModelAndView mv = new ModelAndView();
		if(userService.showDownloadlist()!=null) {
			List<DownloadList> l = (List<DownloadList>) userService.showDownloadlist();
			mv.setViewName("downloads");
			mv.addObject("data", userService.showDownloadlist());
		}else {
			mv.addObject("msg", "List not available");
			mv.setViewName("downloads");
		}
		
		
		return mv;
	}
	
	@RequestMapping(value="/links")
	public ModelAndView linkspage()
	{
		ModelAndView mv = new ModelAndView();
		if(userService.showDownloadlist()!=null) {
			List<Links> l = (List<Links>) userService.showlistoflinks();
			mv.setViewName("links");
			mv.addObject("data", userService.showlistoflinks());
		}else {
			mv.addObject("msg", "List not available");
			mv.setViewName("links");
	}
		return mv;
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logoutpage(HttpServletRequest  request,HttpSession session)
	{
		session.invalidate();
		return new ModelAndView("logout");
	}
	
}
