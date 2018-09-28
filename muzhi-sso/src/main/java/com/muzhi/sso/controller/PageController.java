package com.muzhi.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 展示首页 Controller
 * @author 陈汇奇
 *
 */
@Controller
public class PageController {
	
	@RequestMapping("/login")
	public String showLoginPage(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String showRegisterPage(){
		return "register";
	}

}
