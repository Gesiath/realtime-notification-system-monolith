package com.gesiath.realtime_notification_system.notificationservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketConsumer {

    private final NotificationService notificationService;

    @KafkaListener(topics = "tickets", groupId = "notification-group")
    public void consume(String message){

        notificationService.sendNotification(message);

    }

}
