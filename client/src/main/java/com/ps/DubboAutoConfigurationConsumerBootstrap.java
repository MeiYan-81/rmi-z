package com.ps;

import com.ps.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author VP
 */
@SpringBootApplication
public class DubboAutoConfigurationConsumerBootstrap {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DubboAutoConfigurationConsumerBootstrap.class, args);
    }

//    @Bean
//    public ApplicationRunner runner() {
//        return args -> System.out.println(demoService.sayHello("mydubbo"));
//    }

}
