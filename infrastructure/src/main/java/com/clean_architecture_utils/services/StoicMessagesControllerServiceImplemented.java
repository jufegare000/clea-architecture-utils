package com.clean_architecture_utils.services;

import com.clean_architecture_utils.data.StoicMessageResponse;
import com.clean_architecture_utils.services.stoic_messages.StoicMessagesService;

import java.util.List;

public class StoicMessagesControllerServiceImplemented implements StoicMessagesControllerService {

    private final StoicMessagesService stoicMessagesService;

    public StoicMessagesControllerServiceImplemented(StoicMessagesService stoicMessagesService) {
        this.stoicMessagesService = stoicMessagesService;
    }

    @Override
    public List<StoicMessageResponse> getMotivationalMessages() {
        return stoicMessagesService.getMessagesFromService().stream().map( message ->
                new StoicMessageResponse(message.author(), message.yerOfMention(), message.message())).toList();
    }
}
