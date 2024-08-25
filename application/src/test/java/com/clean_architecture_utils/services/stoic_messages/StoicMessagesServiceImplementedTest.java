package com.clean_architecture_utils.services.stoic_messages;

import org.junit.jupiter.api.Test;

public class StoicMessagesServiceImplementedTest {


    StoicMessagesServiceImplemented stoicMessagesServiceImplemented = new StoicMessagesServiceImplemented(new MotivationalMessagesUseCaseMock());

    @Test
    public void getStoicMessagesFromDomain() {
        assert  !stoicMessagesServiceImplemented.getMessagesFromService().isEmpty();
    }
}
