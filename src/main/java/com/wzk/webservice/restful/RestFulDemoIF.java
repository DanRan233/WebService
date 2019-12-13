package com.wzk.webservice.restful;

import com.wzk.pojo.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @program: RestFul_demo
 * @author: DANRAN2333
 * @create: 2019-12-10 17:29
 * @description: 用于测试RestFul发布接口的接口
 */
//声明RestFul接收的参数类型
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public interface RestFulDemoIF {

    //声明该方法只被GET请求访问
    @GET
    //声明该方法的路径
    @Path("/queryInfo")
    List<User> queryUserInfo();

    @GET
    @Path("/queryID/{name}")
    //@PathParam声明参数以RestFul风格携带在url中   @QueryParam()声明参数以？name="张三" 传参
    List<User> queryUserID(@PathParam("name") String name);
}
