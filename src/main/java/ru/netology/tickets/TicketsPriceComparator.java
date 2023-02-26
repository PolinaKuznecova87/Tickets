package ru.netology.tickets;


import java.util.Comparator;

public class TicketsPriceComparator implements Comparator<Tickets> {


    @Override
    public int compare(Tickets o1, Tickets o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
