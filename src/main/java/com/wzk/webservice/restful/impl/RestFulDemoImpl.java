package com.wzk.webservice.restful.impl;

import com.wzk.pojo.User;
import com.wzk.webservice.restful.RestFulDemoIF;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: RestFul_demo
 * @author: DANRAN2333
 * @create: 2019-12-11 09:36
 * @description:RestFul的实现类
 */
public class RestFulDemoImpl implements RestFulDemoIF {

    @Override
    public List<User> queryUserInfo() {
        System.out.println(99999);
        return null;
    }

    @Override
    public List<User> queryUserID(String name) {
        System.out.println(name);
        List<User> list = new LinkedList<>();
        list.add(new User(name));
        System.out.println(list);
        return list;
    }
}
