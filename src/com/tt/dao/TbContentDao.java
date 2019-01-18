package com.tt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.tt.pojo.TbContent;
import com.tt.pojo.TbContentQuery;

public interface TbContentDao {
    int countByExample(TbContentQuery example);

    int deleteByExample(TbContentQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    List<TbContent> selectByExampleWithBLOBs(TbContentQuery example);

    List<TbContent> selectByExample(TbContentQuery example);

    TbContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentQuery example);

    int updateByExampleWithBLOBs(@Param("record") TbContent record, @Param("example") TbContentQuery example);

    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentQuery example);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKeyWithBLOBs(TbContent record);

    int updateByPrimaryKey(TbContent record);
}