package com.cb.strategypattern.example1;

import java.util.Collections;
import java.util.List;

public class DescendingListingStrategy  implements ListingStrategy{

    @Override
    public List<SupportTicket> listTickets(List<SupportTicket> tickets) {
        Collections.sort(tickets, Collections.reverseOrder(new SorterByTicketId()));
        return tickets;
    }
    
}
