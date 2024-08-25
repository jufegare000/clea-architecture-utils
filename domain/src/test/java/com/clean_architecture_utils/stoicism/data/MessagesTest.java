package com.clean_architecture_utils.stoicism.data;

import org.junit.jupiter.api.Test;

public class MessagesTest {

    @Test
    public void testListOfStoicismMessages() {
        assert !Messages.getInstance().getMotivationalMessages().isEmpty();
    }
}
