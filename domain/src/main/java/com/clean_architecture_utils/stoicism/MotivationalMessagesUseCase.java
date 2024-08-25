package com.clean_architecture_utils.stoicism;

import com.clean_architecture_utils.stoicism.data.StoicMessage;

import java.util.List;

public interface MotivationalMessagesUseCase {
    List<StoicMessage> getListOfMentions();
}
