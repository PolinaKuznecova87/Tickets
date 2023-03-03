package ru.netology.tickets;

import java.util.Arrays;

public class TicketsManager {
    private TicketsRepository repo;

    public TicketsManager(TicketsRepository repo) {
        this.repo = repo;
    }

    public void add(Tickets ticket) {
        repo.add(ticket);

    }

    public Tickets[] findAll(String from, String to) {
        Tickets[] findingTickets = findAll(from, to);

    if (findingTickets == null) {
            throw new NotFoundTicketsException("Ticket with airport name: " + from + to+ " not found");

        }
    

        Tickets[] result = new Tickets[0];
        for (Tickets tickets : repo.findAll()) {
            if (matches(tickets, from, to)) {
                Tickets[] tmp = new Tickets[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];

                }
                tmp[tmp.length - 1] = tickets;
                result = tmp;

            }

        }
        Arrays.sort(result);
        return result;
    }


    private boolean matches(Tickets tickets, String from, String to) {
        if (tickets.getFrom().equals(from)) {
            if (tickets.getTo().equals(to)) {


                return true;

            }
        }
        return false;
    }
}








