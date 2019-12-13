package com.wzk.webservice.soap.impl;

import com.wzk.webservice.soap.SoapDemoIF;

import javax.jws.WebService;

/**
 * @program: RestFul_demo
 * @author: DANRAN2333
 * @create: 2019-12-11 09:36
 * @description: soap接口的实现类
 */
@WebService(serviceName="SoapDemo",//对外发布的服务名
        targetNamespace="http://soap.webservice.wzk.com/SoapDemo",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface="com.wzk.webservice.soap.SoapDemoIF")//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
public class SoapDemoImpl implements SoapDemoIF {

    @Override
    public String testSoap(String testOne) {
        return "123456";
    }
}
