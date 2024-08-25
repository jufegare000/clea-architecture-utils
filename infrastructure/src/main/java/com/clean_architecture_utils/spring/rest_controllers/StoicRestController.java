package com.clean_architecture_utils.spring.rest_controllers;

import com.clean_architecture_utils.data.StoicMessageResponse;
import com.clean_architecture_utils.services.StoicMessagesControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clean-architecture")
public class StoicRestController {

    @Autowired
    private StoicMessagesControllerService stoicMessagesControllerService;

    @GetMapping("stoic-messages")
    public List<StoicMessageResponse> getMotivationalMessages() {
        return stoicMessagesControllerService.getMotivationalMessages();
    }
}
