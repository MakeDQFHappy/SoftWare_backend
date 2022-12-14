package cn.tongji.study.mapper;

import cn.tongji.study.model.Tags;
import cn.tongji.study.model.TagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagsMapper {
    long countByExample(TagsExample example);

    int deleteByExample(TagsExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(Tags record);

    int insertSelective(Tags record);

    List<Tags> selectByExample(TagsExample example);

    Tags selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByExample(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);
}