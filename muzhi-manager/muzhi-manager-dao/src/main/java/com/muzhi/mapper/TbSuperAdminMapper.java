package com.muzhi.mapper;

import com.muzhi.pojo.TbSuperAdmin;
import com.muzhi.pojo.TbSuperAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSuperAdminMapper {
    int countByExample(TbSuperAdminExample example);

    int deleteByExample(TbSuperAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSuperAdmin record);

    int insertSelective(TbSuperAdmin record);

    List<TbSuperAdmin> selectByExample(TbSuperAdminExample example);

    TbSuperAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSuperAdmin record, @Param("example") TbSuperAdminExample example);

    int updateByExample(@Param("record") TbSuperAdmin record, @Param("example") TbSuperAdminExample example);

    int updateByPrimaryKeySelective(TbSuperAdmin record);

    int updateByPrimaryKey(TbSuperAdmin record);
}