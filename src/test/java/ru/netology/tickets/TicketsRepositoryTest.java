package ru.netology.tickets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketsRepositoryTest {
    Tickets tickets1 = new Tickets(11, 10_700, "AER", "DME", 4);
    Tickets tickets2 = new Tickets(12, 68_890, "SVO", "BJS", 21);
    Tickets tickets3 = new Tickets(13, 19_500, "KZN", "OVB", 13);
    Tickets tickets4 = new Tickets(14, 62_100, "CDG", "VOG", 23);
    Tickets tickets5 = new Tickets(15, 143_800, "JVO", "NYC", 17);


    @Test
    public void addTest() {
        TicketsRepository repo = new TicketsRepository();
        repo.add(tickets1);
        repo.add(tickets2);
        repo.add(tickets3);
        repo.add(tickets4);
        repo.add(tickets5);

        Tickets[] expected = {tickets1, tickets2, tickets3, tickets4, tickets5};
        Tickets[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneTickets() {
        TicketsRepository repo = new TicketsRepository();
        Tickets tickets6 = new Tickets(16, 58_500, "AER", "SOF", 12);


        repo.add(tickets6);


        Tickets[] expected = {tickets6};
        Tickets[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeBayIdTest() {
        TicketsRepository repo = new TicketsRepository();
        Tickets tickets7 = new Tickets(17, 19_1587, "ZIA", "KZN", 7);
        Tickets tickets8 = new Tickets(18, 9_721, "MRV", "LED", 4);
        Tickets tickets9 = new Tickets(19, 56_069, "BER", "JVO", 15);
        Tickets tickets10 = new Tickets(20, 76_200, "LED", "TUN", 20);
        Tickets tickets11 = new Tickets(21, 21_900, "IKT", "AER", 12);


        repo.add(tickets7);
        repo.add(tickets8);
        repo.add(tickets9);
        repo.add(tickets10);
        repo.add(tickets11);


        repo.removeByeId(18);
        repo.removeByeId(20);

        Tickets[] expected = {tickets7, tickets9, tickets11};
        Tickets[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldRemoveBayIdWhichIsNot() {
        TicketsRepository repo = new TicketsRepository();
        Tickets tickets12 = new Tickets(22, 5_121, "VKO", "LED", 2);


        repo.add(tickets12);


        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeByeId(24);
        });
    }

}

