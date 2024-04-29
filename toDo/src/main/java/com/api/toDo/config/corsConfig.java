package com.api.toDo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //marco la clase como configuradora en spring.
public class corsConfig implements WebMvcConfigurer {

    @Override // el met ya existente en webMvcConfigurer
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Add your frontend origin here
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
                .allowedHeaders("Content-Type", "Authorization")
                .allowCredentials(true);
    }
}
