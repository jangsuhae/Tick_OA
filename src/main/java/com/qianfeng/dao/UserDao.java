package com.qianfeng.dao;

import java.util.List;

public interface UserDao {

    public String findPwdByName(String name);

    public List<String> findRoleByName(String name);

    public List<String> findPermisionByName(String name);

}
