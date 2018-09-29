package com.baostorm.baocms.config.properties;

import lombok.Data;

@Data
public class SwaggerProperties {
    private String title;

    private String description;

    private String version = "1.0";

    private String license = "Apache License 2.0";

    private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

    private String contactName = "BaoStorm";

    private String contactUrl = "http://baostorm.com";

    private String contactEmail = "baoxing666666@gmail.com";
}
