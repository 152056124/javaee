package com.ztc.mapper;

import com.ztc.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Coursemapper {
    List<Course> selectCourse(String cno);

//    int insertCourse(@Param("cno") String cno,@Param("cname") String cname,@Param("credit") int credit,@Param("semester") int semester);
//    int insertCourse(Map<String,Object> insertMap);
      int insertCourse(@Param("course") Course course);
}
