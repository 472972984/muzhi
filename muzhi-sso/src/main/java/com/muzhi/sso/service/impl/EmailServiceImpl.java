package com.muzhi.sso.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.common.util.ExceptionUtil;
import com.muzhi.sso.component.SendEmailUtil;
import com.muzhi.sso.service.EmailService;


/**
 * 发送邮箱Service
 * 
 * @author 陈汇奇
 *
 */
@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private SendEmailUtil sendEmailUtil;

	@Override
	public MuZhiResult sendEmail(String recipientAddress) {
		
		try {
			String code = SendEmailUtil.sendEmail("472972984@qq.com", "ictbnjmuigakbgbf", "MuZhiEmail", "",
			        new String[] {recipientAddress});
			return MuZhiResult.ok(code);
			
		} catch (Exception e) {
			e.printStackTrace();
			return  MuZhiResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}
