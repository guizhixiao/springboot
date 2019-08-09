package com.fly.project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    @Select("select username from user")
    List<Map<String, String>> getUserList();
}
