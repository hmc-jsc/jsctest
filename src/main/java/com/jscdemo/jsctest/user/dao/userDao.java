package com.jscdemo.jsctest.user.dao;

import com.jscdemo.jsctest.user.entity.userEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface userDao {
    List<userEntity> getAll(@Param("content") Map map);

    void delById(Integer id);

    void save(userEntity userEntity);
}
