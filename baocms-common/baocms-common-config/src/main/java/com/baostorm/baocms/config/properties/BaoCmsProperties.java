package com.baostorm.baocms.config.properties;

import com.baostorm.baocms.base.constant.GlobalConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author BaoStorm
 */
@Data
@ConfigurationProperties(prefix = GlobalConstant.ROOT_PREFIX)
public class BaoCmsProperties {
    private SwaggerProperties swagger = new SwaggerProperties();
}
