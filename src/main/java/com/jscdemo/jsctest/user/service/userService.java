package com.jscdemo.jsctest.user.service;


import com.jscdemo.jsctest.user.entity.userEntity;

import java.util.List;
import java.util.Map;

public interface userService {
    List<userEntity> getAll(Map map);

    void delById(Integer id);

    void save(userEntity userEntity);
}
