package com.cb.strategypattern.example1;

import java.util.Collections;
import java.util.List;


public class AscendingListingStrategy implements ListingStrategy {


    @Override
    public List<SupportTicket> listTickets(List<SupportTicket> tickets) {
        Collections.sort(tickets, new SorterByTicketId());
        return tickets;
    }
}
