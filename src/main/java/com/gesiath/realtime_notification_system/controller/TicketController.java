package com.gesiath.realtime_notification_system.controller;

import com.gesiath.realtime_notification_system.model.Ticket;
import com.gesiath.realtime_notification_system.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @PostMapping
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket){

        Ticket created = ticketService.createTicket(ticket);

        return ResponseEntity.ok(created);

    }

}
