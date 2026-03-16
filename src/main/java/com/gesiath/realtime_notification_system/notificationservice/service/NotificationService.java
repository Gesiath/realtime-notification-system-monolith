package com.gesiath.realtime_notification_system.notificationservice.service;

import com.gesiath.realtime_notification_system.ticketservice.entity.Ticket;
import com.gesiath.realtime_notification_system.ticketservice.event.TicketCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final SimpMessagingTemplate messagingTemplate;

    public void sendNotification(String message){

        messagingTemplate.convertAndSend("/topic/notifications", message);

    }

    @EventListener
    public void handleTicketCreated(TicketCreatedEvent event){

        Ticket ticket = event.getTicket();
        messagingTemplate.convertAndSend("/topic/notifications",
                "New ticket created: " + ticket.getTitle());

    }

}
