package com.gesiath.realtime_notification_system.ticketservice.service;

import com.gesiath.realtime_notification_system.ticketservice.entity.Ticket;
import com.gesiath.realtime_notification_system.ticketservice.event.TicketCreatedEvent;
import com.gesiath.realtime_notification_system.ticketservice.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final ApplicationEventPublisher publisher;

    public Ticket createTicket(Ticket ticket){

        Ticket saved = ticketRepository.save(ticket);

        publisher.publishEvent(new TicketCreatedEvent(this, saved));

        return saved;

    }

}
