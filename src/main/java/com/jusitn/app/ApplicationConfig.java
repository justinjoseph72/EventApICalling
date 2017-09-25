package com.jusitn.app;

import com.jusitn.app.service.EventService;
import com.jusitn.app.service.EventServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public EventService getEventService(){
        return new EventServiceImpl();
    }

}
