package com.wzk.webservice.restful.impl;

import com.wzk.pojo.User;
import com.wzk.webservice.restful.RestFulDemoTwoIF;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: RestFul_demo
 * @author: DANRAN2333
 * @create: 2019-12-11 12:53
 * @description:
 */
public class RestFulDemoTwoImpl implements RestFulDemoTwoIF {
    @Override
    public List<User> queryUserInfo() {
        return null;
    }

    @Override
    public List<User> queryUserID(User user) {
        List<?> listw=new LinkedList<>();
        System.out.println(user);
        List<User> list = new LinkedList<>();
        user.setId(123);
        list.add(user);
        System.out.println(list);
        return list;
    }
}
