package ru.netology.tickets;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketsTest {
    @Test
    public void shouldCompareToPriceTickets1IessThenPriceTickets2() {
        Tickets tickets1 = new Tickets(11, 10_700, "AER", "DME", 4);
        Tickets tickets2 = new Tickets(12, 68_890, "SVO", "BJS", 21);
        Tickets tickets3 = new Tickets(13, 19_500, "KZN", "OVB", 13);
        Tickets tickets4 = new Tickets(14, 62_100, "CDG", "VOG", 23);
        Tickets tickets5 = new Tickets(15, 143_800, "JVO", "NYC", 17);

        tickets1.compareTo(tickets2);
        Tickets[] expected = {tickets1};
        Tickets[] actual = {tickets1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCompareToPriceTickets2MoreThenPriceTickets3() {
        Tickets tickets1 = new Tickets(11, 10_700, "AER", "DME", 4);
        Tickets tickets2 = new Tickets(12, 68_890, "SVO", "BJS", 21);
        Tickets tickets3 = new Tickets(13, 19_500, "KZN", "OVB", 13);
        Tickets tickets4 = new Tickets(14, 62_100, "CDG", "VOG", 23);
        Tickets tickets5 = new Tickets(15, 143_800, "JVO", "NYC", 17);

        tickets2.compareTo(tickets3);
        Tickets[] expected = {tickets2};
        Tickets[] actual = {tickets2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCompareToPriceTickets4EqualToThenPriceTickets5() {
        Tickets tickets1 = new Tickets(11, 10_700, "AER", "DME", 4);
        Tickets tickets2 = new Tickets(12, 68_890, "SVO", "BJS", 21);
        Tickets tickets3 = new Tickets(13, 19_500, "KZN", "OVB", 13);
        Tickets tickets4 = new Tickets(14, 62_100, "CDG", "VOG", 23);
        Tickets tickets5 = new Tickets(15, 143_800, "JVO", "NYC", 17);
        Tickets tickets6 = new Tickets(16, 62_100, "CDG", "VOG", 24);

        tickets4.compareTo(tickets6);
        Tickets[] expected = {tickets4};
        Tickets[] actual = {tickets4};
        Assertions.assertArrayEquals(expected, actual);
    }
}

