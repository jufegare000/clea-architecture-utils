package com.clean_architecture_utils.stoicism;

import com.clean_architecture_utils.stoicism.data.Messages;
import com.clean_architecture_utils.stoicism.data.StoicMessage;

import java.util.List;

public class MotivationalMessagesUseCaseImplemented implements MotivationalMessagesUseCase {

    @Override
    public List<StoicMessage> getListOfMentions() {
        return Messages.getInstance().getMotivationalMessages();
    }
}
