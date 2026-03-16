package com.gesiath.realtime_notification_system.ticketservice.repository;

import com.gesiath.realtime_notification_system.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
