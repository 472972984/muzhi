package com.muzhi.mapper;

import com.muzhi.pojo.TbClassification2;
import com.muzhi.pojo.TbClassification2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClassification2Mapper {
    int countByExample(TbClassification2Example example);

    int deleteByExample(TbClassification2Example example);

    int deleteByPrimaryKey(Long id);

    int insert(TbClassification2 record);

    int insertSelective(TbClassification2 record);

    List<TbClassification2> selectByExample(TbClassification2Example example);

    TbClassification2 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbClassification2 record, @Param("example") TbClassification2Example example);

    int updateByExample(@Param("record") TbClassification2 record, @Param("example") TbClassification2Example example);

    int updateByPrimaryKeySelective(TbClassification2 record);

    int updateByPrimaryKey(TbClassification2 record);
}