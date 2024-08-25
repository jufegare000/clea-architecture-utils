package com.clean_architecture_utils.services.stoic_messages;

import com.clean_architecture_utils.services.stoic_messages.data.StoicMessageDTO;
import com.clean_architecture_utils.stoicism.MotivationalMessagesUseCase;

import java.util.List;

public class StoicMessagesServiceImplemented implements StoicMessagesService {

    private final MotivationalMessagesUseCase motivationalMessagesUseCase;

    public StoicMessagesServiceImplemented(MotivationalMessagesUseCase motivationalMessagesUseCase) {
        this.motivationalMessagesUseCase = motivationalMessagesUseCase;
    }

    @Override
    public List<StoicMessageDTO> getMessagesFromService() {
        return parseMessagesFromDomain();
    }

    public List<StoicMessageDTO> parseMessagesFromDomain() {
        return motivationalMessagesUseCase.getListOfMentions().stream().map(message ->
                new StoicMessageDTO(message.author(), message.yearOfMention(), message.message())
        ).toList();
    }
}
