package com.clean_architecture_utils.services.stoic_messages.data;

public record StoicMessageDTO(
        String author,
        String yerOfMention,
        String message
) {}
