package com.clean_architecture_utils.spring.config;

import com.clean_architecture_utils.config.StoicServiceBeanConfig;
import com.clean_architecture_utils.services.StoicMessagesControllerService;
import com.clean_architecture_utils.services.StoicMessagesControllerServiceImplemented;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    private static final StoicMessagesControllerService stoicMessagesControllerService = new StoicMessagesControllerServiceImplemented(StoicServiceBeanConfig.getStoicMessagesService());

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public static StoicMessagesControllerService getStoicMessagesControllerService() {
        return stoicMessagesControllerService;
    }


}
