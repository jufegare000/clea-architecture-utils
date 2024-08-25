package com.clean_architecture_utils.services.stoic_messages;

import com.clean_architecture_utils.stoicism.MotivationalMessagesUseCase;
import com.clean_architecture_utils.stoicism.data.StoicMessage;

import java.util.List;

public class MotivationalMessagesUseCaseMock implements MotivationalMessagesUseCase {


    @Override
    public List<StoicMessage> getListOfMentions() {
        return List.of(new StoicMessage("mock author", "2024", "hi!"));
    }
}
