package com.muzhi.sso.service;

import com.muzhi.common.pojo.MuZhiResult;

public interface LoginService {

	MuZhiResult Login(String email , String password);
	
}
