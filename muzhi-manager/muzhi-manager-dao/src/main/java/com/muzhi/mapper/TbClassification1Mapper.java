package com.muzhi.mapper;

import com.muzhi.pojo.TbClassification1;
import com.muzhi.pojo.TbClassification1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClassification1Mapper {
    int countByExample(TbClassification1Example example);

    int deleteByExample(TbClassification1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(TbClassification1 record);

    int insertSelective(TbClassification1 record);

    List<TbClassification1> selectByExample(TbClassification1Example example);

    TbClassification1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbClassification1 record, @Param("example") TbClassification1Example example);

    int updateByExample(@Param("record") TbClassification1 record, @Param("example") TbClassification1Example example);

    int updateByPrimaryKeySelective(TbClassification1 record);

    int updateByPrimaryKey(TbClassification1 record);
}