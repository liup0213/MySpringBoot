package com.liupeng.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//说明是springboot的程序,开启spring自动配置
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //启动springboot程序，启动spring容器，启动内嵌的Tomcat
        SpringApplication.run(Application.class, args);
    }
}
