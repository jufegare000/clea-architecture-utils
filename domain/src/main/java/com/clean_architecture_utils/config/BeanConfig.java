package com.clean_architecture_utils.config;

import com.clean_architecture_utils.stoicism.MotivationalMessagesUseCase;
import com.clean_architecture_utils.stoicism.MotivationalMessagesUseCaseImplemented;

public class BeanConfig {

    private static final MotivationalMessagesUseCase motivationalMessagesUseCase = new MotivationalMessagesUseCaseImplemented();

    public static MotivationalMessagesUseCase getMotivationalMessagesUseCase() {
        return motivationalMessagesUseCase;
    }
}
