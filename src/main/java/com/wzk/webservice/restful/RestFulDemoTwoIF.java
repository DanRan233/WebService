package com.wzk.webservice.restful;

import com.wzk.pojo.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @program: RestFul_demo
 * @author: DANRAN2333
 * @create: 2019-12-11 12:53
 * @description:
 */
//定义返回值类型只能是json与xml
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//定义参数类型只能是json与xml
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public interface RestFulDemoTwoIF {
    //声明该方法只被GET请求访问
    @GET
    //声明该方法的路径
    @Path("/queryInfo")
    List<User> queryUserInfo();

    @POST
    @Path("/queryID")
    List<User> queryUserID(User user);
}
