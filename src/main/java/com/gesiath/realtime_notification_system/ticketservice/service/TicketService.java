package com.gesiath.realtime_notification_system.ticketservice.service;

import com.gesiath.realtime_notification_system.ticketservice.entity.Ticket;
import com.gesiath.realtime_notification_system.ticketservice.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final TicketProducer ticketProducer;

    public Ticket createTicket(Ticket ticket){

        Ticket saved = ticketRepository.save(ticket);

        ticketProducer.sendTicketNotification(saved.getTitle());

        return saved;

    }

}
