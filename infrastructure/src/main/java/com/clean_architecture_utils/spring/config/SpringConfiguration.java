package com.clean_architecture_utils.spring.config;

import com.clean_architecture_utils.config.StoicServiceBeanConfig;
import com.clean_architecture_utils.services.StoicMessagesControllerService;
import com.clean_architecture_utils.services.StoicMessagesControllerServiceImplemented;
import tools.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    private static final StoicMessagesControllerService stoicMessagesControllerService = new StoicMessagesControllerServiceImplemented(StoicServiceBeanConfig.getStoicMessagesService());

    @Bean
    public JsonMapper objectMapper() {
        return JsonMapper.builder().build();
    }

    @Bean
    public static StoicMessagesControllerService getStoicMessagesControllerService() {
        return stoicMessagesControllerService;
    }


}
