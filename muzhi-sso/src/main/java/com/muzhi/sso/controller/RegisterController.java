package com.muzhi.sso.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.common.util.ExceptionUtil;
import com.muzhi.pojo.TbUser;
import com.muzhi.sso.service.RegisterService;

/**
 * 用户注册Controller
 * @author 陈汇奇
 *
 */
@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/register/save")
	@ResponseBody
	public MuZhiResult register(String username , String password , String email ){
		
		if(username.contains(" ")){
			return MuZhiResult.build(500,"请不要输入空格");
		}
		
		if(password.contains(" ")){
			return MuZhiResult.build(500, "请不要输入空格");
		}
		
		try {
			//填充数据
			TbUser user = new TbUser();
			user.setNickname(username);
			//user.setUsername(username);
			//采用MD5算法加密
			password = DigestUtils.md5DigestAsHex(password.getBytes());
			user.setPassword(password);
			user.setEmail(email);
			user.setCreated(new Date());
			user.setUpdated(new Date());
			//执行插入表
			MuZhiResult result = registerService.register(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return MuZhiResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	

}
