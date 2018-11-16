package com.scme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2018/11/16.
 */
@SpringBootApplication
@EnableConfigServer
public class configServerApp {
    public static void main(String[] args) {
        SpringApplication.run(configServerApp.class,args);
    }

}
