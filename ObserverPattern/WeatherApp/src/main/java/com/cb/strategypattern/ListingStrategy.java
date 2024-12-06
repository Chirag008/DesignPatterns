package com.cb.strategypattern.example1;

import java.util.List;

public interface ListingStrategy {
    public List<SupportTicket> listTickets(List<SupportTicket> tickets);
}
