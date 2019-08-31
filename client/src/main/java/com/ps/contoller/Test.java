package com.ps.contoller;

import com.ps.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VP
 */
@RestController
public class Test {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("/home")
    public void home(){
        // 隐式传参，后面的远程调用都会隐式将这些参数发送到服务器端，类似cookie，用于框架集成，不建议常规业务使用
        RpcContext.getContext().setAttachment("index","想你");
        System.out.println(demoService.sayHello("phalaenopsis"));
    }

}
