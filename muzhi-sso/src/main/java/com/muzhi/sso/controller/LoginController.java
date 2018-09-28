package com.muzhi.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.sso.service.LoginService;

/**
 * 用户登录Controller
 * @author 陈汇奇
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login/user")
	@ResponseBody
	public MuZhiResult login(String email,String password){
		MuZhiResult result = loginService.Login(email, password);
		return result;
	}
	

}
