package com.gesiath.realtime_notification_system.ticketservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "tickets";

    public void sendTicketNotification(String message){

        kafkaTemplate.send(TOPIC, message);

    }

}
