package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.service.UserService;
import com.qianfeng.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feng
 * @create 2019-04-11 上午 10:27
 */
@RestController
public class LoginServlet {
    @Autowired
    private UserService userService;
    @RequestMapping("/login.do")

    public JsonBean LoginUser(String no , String pass, boolean remaberme){

        try {
//            userService.login(username,password);
            userService.login(no,pass,remaberme);
            return JsonUtils.createJsonBean(1,null);
        }catch (Exception e){
            return  JsonUtils.createJsonBean(0, e.getMessage());
        }

        }
}
