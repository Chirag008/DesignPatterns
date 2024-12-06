package com.cb.strategypattern.example1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    
    public static void processTickets(List<SupportTicket> tickets, ListingStrategy strategy){
        if(tickets.size()==0){
            System.out.println("No Pending tickets !");
            return;
        }
        List<SupportTicket> ticketsToProcess = strategy.listTickets(tickets);
        for(SupportTicket ticket : ticketsToProcess){
            System.out.println("Processing Ticket - " + ticket);
        }
    }

    public static void main(String[] args) {
        SupportTicket ticket1 = new SupportTicket("ticket-110928", "Chirag Bansal", "Outlook not accessible!");
        SupportTicket ticket2 = new SupportTicket("ticket-108927", "John Cena", "Need access to AWS console");
        SupportTicket ticket3 = new SupportTicket("ticket-123904", "Rohit Kumar", "I need access to the JIRA confluence");

        List<SupportTicket> tickets = new ArrayList<>(){
            {
                add(ticket1);
                add(ticket2);
                add(ticket3);
            }
        };

        processTickets(tickets, new RandomListingStrategy());

    }
}
