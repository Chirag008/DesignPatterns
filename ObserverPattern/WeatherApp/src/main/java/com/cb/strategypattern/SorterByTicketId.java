package com.cb.strategypattern.example1;

import java.util.Comparator;

public class SorterByTicketId implements Comparator<SupportTicket> {

    @Override
    public int compare(SupportTicket o1, SupportTicket o2) {
        return o1.ticketId.compareTo(o2.ticketId);
    }
    
}
