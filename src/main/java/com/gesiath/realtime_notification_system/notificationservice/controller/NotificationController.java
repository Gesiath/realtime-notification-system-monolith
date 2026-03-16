package com.gesiath.realtime_notification_system.notificationservice.controller;

import com.gesiath.realtime_notification_system.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/notify")
    public ResponseEntity<Void> sendNotification(@RequestBody String message){

        notificationService.sendNotification(message);

        return ResponseEntity.noContent().build();

    }

}
