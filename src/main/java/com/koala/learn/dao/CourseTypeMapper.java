package com.koala.learn.dao;

import com.koala.learn.entity.CourseType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    CourseType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKey(CourseType record);

    List<CourseType> selectAllCourseType();

    List<CourseType> selectAllOJType();
}