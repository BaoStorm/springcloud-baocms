package com.baostorm.baocms.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author BaoStorm
 */
@EnableEurekaServer
@SpringBootApplication
public class BaoCmsEurekaApplication  {


    public static void main(String[] args) {
        SpringApplication.run(BaoCmsEurekaApplication.class, args);
    }
}
