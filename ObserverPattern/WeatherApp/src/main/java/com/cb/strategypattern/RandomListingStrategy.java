package com.cb.strategypattern.example1;

import java.util.Collections;
import java.util.List;

public class RandomListingStrategy implements ListingStrategy {

    @Override
    public List<SupportTicket> listTickets(List<SupportTicket> tickets) {
        Collections.shuffle(tickets);
        return tickets;
    }
    
}
