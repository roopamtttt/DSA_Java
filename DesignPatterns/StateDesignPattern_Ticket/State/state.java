package DesignPatterns.StateDesignPattern_Ticket.State;

import DesignPatterns.StateDesignPattern_Ticket.DTO.Ticket;
import DesignPatterns.StateDesignPattern_Ticket.DTO.User;

public interface state {
    boolean StartAnslysis(User user, Ticket ticket);
    boolean StartReview(User user, Ticket ticket);
    boolean MarkDone(User user, Ticket ticket);

}
