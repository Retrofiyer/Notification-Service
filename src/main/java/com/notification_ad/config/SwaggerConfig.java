package com.notification_ad.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Api Rest Notification",
                version = "1.0",
                description = "This is a api rest notification used for confirmation account"
        )
)
public class SwaggerConfig {
}
