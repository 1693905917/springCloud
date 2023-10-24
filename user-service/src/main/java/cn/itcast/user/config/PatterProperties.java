package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.user.config
 * @Author: ASUS
 * @CreateTime: 2023-10-24  21:22
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatterProperties {
    private String dateformat;
}
