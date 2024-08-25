package com.clean_architecture_utils.services;

import com.clean_architecture_utils.data.StoicMessageResponse;

import java.util.List;

public interface StoicMessagesControllerService {
    List<StoicMessageResponse>  getMotivationalMessages();
}
