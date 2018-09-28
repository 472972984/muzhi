package com.muzhi.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.sso.service.EmailService;
import com.muzhi.sso.service.RegisterService;

/**
 * 发布发送邮箱Controller
 * @author 陈汇奇
 *
 */
@Controller
public class SendEmailController {
	
	@Autowired
	private EmailService emailService;
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/register/send/email")
	@ResponseBody
	public MuZhiResult sendEmail(String emailAdd){
		MuZhiResult checkData = registerService.checkData(emailAdd);
		//如果没有被占用
		if((boolean) checkData.getData()){
			//发送邮箱验证码
			MuZhiResult result = emailService.sendEmail(emailAdd);
			return result;
		}
		//如果被占用
		return MuZhiResult.build(500, "邮箱被占用！");
	}
	
	
	
}
