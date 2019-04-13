package com.qianfeng.service;

import org.springframework.stereotype.Service;

/**
 * @author feng
 * @create 2019-04-11 上午 10:31
 */
public interface UserService {


    public  void login(String name ,String password, boolean remaberme);
}
