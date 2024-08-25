package com.clean_architecture_utils.services.stoic_messages;

import com.clean_architecture_utils.services.stoic_messages.data.StoicMessageDTO;

import java.util.List;

public interface StoicMessagesService {

    List<StoicMessageDTO> getMessagesFromService();
}
