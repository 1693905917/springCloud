package cn.itcast.fegin.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.order.config
 * @Author: ASUS
 * @CreateTime: 2023-10-24  23:25
 * @Description: TODO
 * @Version: 1.0
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC;
    }
}
