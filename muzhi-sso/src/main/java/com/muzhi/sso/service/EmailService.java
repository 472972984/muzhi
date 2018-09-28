package com.muzhi.sso.service;

import com.muzhi.common.pojo.MuZhiResult;

public interface EmailService {
	
	MuZhiResult sendEmail(String recipientAddress);
	
}
