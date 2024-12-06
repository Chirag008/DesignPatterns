package com.cb.strategypattern.example1;


public class SupportTicket{

    String ticketId;
    String raisedBy;
    String description;

    

    public SupportTicket(String ticketId, String raisedBy, String description) {
        this.ticketId = ticketId;
        this.raisedBy = raisedBy;
        this.description = description;
    }
    
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public String getRaisedBy() {
        return raisedBy;
    }
    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return String.format("[id - %s, raised by - %s, description - %s]", ticketId, raisedBy, description);
    }
    
}