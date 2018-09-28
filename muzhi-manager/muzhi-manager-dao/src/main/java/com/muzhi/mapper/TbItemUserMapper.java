package com.muzhi.mapper;

import com.muzhi.pojo.TbItemUser;
import com.muzhi.pojo.TbItemUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemUserMapper {
    int countByExample(TbItemUserExample example);

    int deleteByExample(TbItemUserExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemUser record);

    int insertSelective(TbItemUser record);

    List<TbItemUser> selectByExample(TbItemUserExample example);

    TbItemUser selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") TbItemUser record, @Param("example") TbItemUserExample example);

    int updateByExample(@Param("record") TbItemUser record, @Param("example") TbItemUserExample example);

    int updateByPrimaryKeySelective(TbItemUser record);

    int updateByPrimaryKey(TbItemUser record);
}