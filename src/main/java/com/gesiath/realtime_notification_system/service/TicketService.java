package com.gesiath.realtime_notification_system.service;

import com.gesiath.realtime_notification_system.model.Ticket;
import com.gesiath.realtime_notification_system.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final NotificationService notificationService;

    public Ticket createTicket(Ticket ticket){

        Ticket saved = ticketRepository.save(ticket);

        notificationService.sendNotification("New ticket created: " + saved.getTitle());

        return saved;

    }

}
