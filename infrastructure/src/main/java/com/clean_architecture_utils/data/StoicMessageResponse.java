package com.clean_architecture_utils.data;

public record StoicMessageResponse(
        String author,
        String livedOn,
        String message
) {
}
