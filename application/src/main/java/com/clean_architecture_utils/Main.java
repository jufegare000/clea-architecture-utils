package com.clean_architecture_utils;


import com.clean_architecture_utils.config.BeanConfig;
import com.clean_architecture_utils.stoicism.MotivationalMessagesUseCase;

public class Main {
    public static void main(String[] args) {
        MotivationalMessagesUseCase stoicMessagesService = BeanConfig.getMotivationalMessagesUseCase();
        stoicMessagesService.getListOfMentions().forEach(elem -> System.out.println(elem));
    }
}