package com.clean_architecture_utils.config;

import com.clean_architecture_utils.services.stoic_messages.StoicMessagesService;
import com.clean_architecture_utils.services.stoic_messages.StoicMessagesServiceImplemented;

public class StoicServiceBeanConfig {

    private static final StoicMessagesService stoicMessagesService =
            new StoicMessagesServiceImplemented(BeanConfig.getMotivationalMessagesUseCase());

    public static StoicMessagesService getStoicMessagesService() {
        return stoicMessagesService;
    }
}
