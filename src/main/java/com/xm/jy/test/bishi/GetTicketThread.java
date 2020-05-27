package com.xm.jy.test.bishi;

/**
 * @auther 方翔鸣
 * @date 2020/3/11 10:01
 */
public class GetTicketThread implements Runnable {

    private Ticket ticket;

    private int whatNum;

    public GetTicketThread(Ticket ticket,int whatNum){
        this.ticket = ticket;
        this.whatNum = whatNum;
    }

    @Override
    public void run() {
        ticket.getTicket(whatNum);
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        GetTicketThread ticketThread = new GetTicketThread(ticket,23);
        GetTicketThread ticketThread1 = new GetTicketThread(ticket,23);
        Thread thread = new Thread(ticketThread,"购买者1号");
        Thread thread1 = new Thread(ticketThread1,"购买者2号");
        thread.start();
        thread1.start();
    }
}
