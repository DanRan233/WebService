package com.wzk.webservice.soap;

import org.apache.cxf.annotations.WSDLDocumentation;
import org.apache.cxf.annotations.WSDLDocumentation.Placement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @program: RestFul_demo
 * @author: DANRAN2333
 * @create: 2019-12-10 17:29
 * @description:用于测试Soap发布接口的接口
 */
//暴露接口服务名称，声明接口的命名空间
@WebService(name = "SoapDemo" ,targetNamespace = "http://soap.webservice.wzk.com/SoapDemo")
//在wsdl信息中声明注释
@WSDLDocumentation(value = "这是我测试webservice发布soap接口的文档" , placement = Placement.SERVICE)
public interface SoapDemoIF {


    //定义方法的名称及访问地址
    @WebMethod(operationName = "testSopa" ,action = "http://soap.webservice.wzk.com/SoapDemo/testSoap")
    @WSDLDocumentation(value = "这是测试Soap接口中的一个方法" , placement = Placement.BINDING)
    //定义方法返回值的名称及命名空间
    @WebResult(name = "testResult", targetNamespace = "http://soap.webservice.wzk.com/SoapDemo")
    public String testSoap(
        @WebParam(name = "testOne" ,targetNamespace = "http://soap.webservice.wzk.com/SoapDemo") String testOne
    );

}
