package com.muzhi.sso.service;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.pojo.TbUser;

public interface RegisterService {

	MuZhiResult register(TbUser user);

	MuZhiResult checkData(String email);
	
}
