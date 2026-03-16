package com.gesiath.realtime_notification_system.repository;

import com.gesiath.realtime_notification_system.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
