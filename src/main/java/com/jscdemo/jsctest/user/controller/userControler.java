package com.jscdemo.jsctest.user.controller;

import com.jscdemo.jsctest.user.entity.userEntity;
import com.jscdemo.jsctest.user.service.userService;
import com.sun.xml.internal.ws.server.ServerRtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/*
*
* @RestController =@ResponseBody + @Controller
*
* */
@Controller
@RequestMapping("user")
public class userControler {
    @Autowired
    userService userService;
    @ResponseBody //返回json数据
    @RequestMapping("/getAll")
    public List<userEntity> getAll(Map map){
        return userService.getAll(map);
    }
    @RequestMapping("/delById")
    public  String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }
    @RequestMapping("/save")
    public String save(@RequestBody userEntity userEntity){
        userService.save(userEntity);
        return "success";
    }
}
