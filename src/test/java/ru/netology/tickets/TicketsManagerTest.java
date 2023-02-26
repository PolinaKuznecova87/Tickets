package ru.netology.tickets;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketsManagerTest {
    TicketsRepository repo = new TicketsRepository();
    TicketsManager manager = new TicketsManager(repo);
    TicketsPriceComparator priceComparator = new TicketsPriceComparator();


    @Test
    public void shouldAllTickets() {
        Tickets tickets1 = new Tickets(11, 10_700, "SVO", "BJS", 4);
        Tickets tickets2 = new Tickets(12, 68_890, "SVO", "BJS", 21);
        Tickets tickets3 = new Tickets(13, 19_500, "KZN", "OVB", 13);
        Tickets tickets4 = new Tickets(14, 62_100, "SVO", "BJS", 23);
        Tickets tickets5 = new Tickets(15, 143_800, "JVO", "NYC", 17);


        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);

        Tickets[] expected = {tickets1, tickets2, tickets3, tickets4, tickets5};
        Tickets[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldSortTickets() {
        Tickets tickets1 = new Tickets(11, 10_700, "SVO", "BJS", 4);
        Tickets tickets2 = new Tickets(12, 68_890, "SVO", "BJS", 21);
        Tickets tickets3 = new Tickets(13, 19_500, "KZN", "OVB", 13);
        Tickets tickets4 = new Tickets(14, 62_100, "SVO", "BJS", 23);
        Tickets tickets5 = new Tickets(15, 143_800, "JVO", "NYC", 17);


        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);

        Tickets[] expected = {tickets1, tickets4, tickets2};
        Tickets[] actual = manager.findAll("SVO", "BJS", new TicketsPriceComparator());
        Assertions.assertArrayEquals(expected, actual);


    }
}
