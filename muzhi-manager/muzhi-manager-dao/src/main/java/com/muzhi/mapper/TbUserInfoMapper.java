package com.muzhi.mapper;

import com.muzhi.pojo.TbUserInfo;
import com.muzhi.pojo.TbUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserInfoMapper {
    int countByExample(TbUserInfoExample example);

    int deleteByExample(TbUserInfoExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(TbUserInfo record);

    int insertSelective(TbUserInfo record);

    List<TbUserInfo> selectByExample(TbUserInfoExample example);

    TbUserInfo selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") TbUserInfo record, @Param("example") TbUserInfoExample example);

    int updateByExample(@Param("record") TbUserInfo record, @Param("example") TbUserInfoExample example);

    int updateByPrimaryKeySelective(TbUserInfo record);

    int updateByPrimaryKey(TbUserInfo record);
}