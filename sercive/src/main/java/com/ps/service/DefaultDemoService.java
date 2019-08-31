package com.ps.service;

import com.ps.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author VP
 */
@Service(version = "1.0.0",delay=20000)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name){
        // 获取客户端隐式传入的参数，用于框架集成，不建议常规业务使用
        System.out.println(RpcContext.getContext().getAttachment("index"));
        return "多想再走一回："+name;
    }

}
