package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.eureka
 * @Author: ASUS
 * @CreateTime: 2023-10-18  22:29
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
