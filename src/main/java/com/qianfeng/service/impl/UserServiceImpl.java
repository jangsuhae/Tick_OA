package com.qianfeng.service.impl;

import com.qianfeng.service.UserService;
import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

/**
 * @author feng
 * @create 2019-04-11 上午 10:32
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public void login(String name, String password, boolean remaberme) {
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name, password);
        if (remaberme == true){
            usernamePasswordToken.setRememberMe(true);
        }
        Subject subject = SecurityUtils.getSubject();
        subject.login(usernamePasswordToken);
    }
}

