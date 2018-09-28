package com.muzhi.sso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.mapper.TbUserMapper;
import com.muzhi.pojo.TbUser;
import com.muzhi.pojo.TbUserExample;
import com.muzhi.pojo.TbUserExample.Criteria;
import com.muzhi.sso.service.LoginService;

/**
 * 用户登录Service
 * 
 * @author 陈汇奇
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private TbUserMapper userMapper;

	@Override
	public MuZhiResult Login(String email, String password) {

		// 验证用户名
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		// 执行查找
		List<TbUser> list = userMapper.selectByExample(example);

		if (list == null || list.isEmpty()) {
			return MuZhiResult.build(400, "邮箱或密码错误！");
		}

		TbUser user = list.get(0);

		// 验证密码
		if (!user.getPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes()))) {
			return MuZhiResult.build(400, "用户名或密码错误！");
		}

		return MuZhiResult.ok();
	}

}
