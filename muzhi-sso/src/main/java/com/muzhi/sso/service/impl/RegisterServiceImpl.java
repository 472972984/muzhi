package com.muzhi.sso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.mapper.TbUserMapper;
import com.muzhi.pojo.TbUser;
import com.muzhi.pojo.TbUserExample;
import com.muzhi.pojo.TbUserExample.Criteria;
import com.muzhi.sso.service.RegisterService;

/**
 * 用户注册Service
 * @author 陈汇奇
 *
 */
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private TbUserMapper userMapper;

	@Override
	public MuZhiResult register(TbUser user) {
		
		//对各字段进行校验是否存在
		MuZhiResult data = checkData(user.getEmail());
		
		//如果没又占用
		if((boolean) data.getData()){
			//允许注册
			userMapper.insert(user);
			return MuZhiResult.ok();
		}
		
		//已经被占用
		return MuZhiResult.build(500, "邮箱已经被占用");
	}

	
	/**
	 * 通过调用userMapper查询数据库，是否存在。存在返回false， 不存在返回true
	 */
	@Override
	public MuZhiResult checkData(String email) {
		
		//查询数据库，查看邮箱是否占用
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		
		List<TbUser> list = userMapper.selectByExample(example);
		//如果没有占用返回true
		if(list == null || list.size() == 0){
			return MuZhiResult.ok(true);
		}
		
		return MuZhiResult.ok(false);
		
	}
	
}
