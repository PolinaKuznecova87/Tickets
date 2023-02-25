package ru.netology.tickets;

public class TicketsRepository {
    Tickets[] tickets = new Tickets[0];

    public void add(Tickets ticket) {

        Tickets[] tmp = new Tickets[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }

        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Tickets[] findAll() {
        return tickets;

    }

    public Tickets findById(int id) {

        for (Tickets tickets : tickets) {

            if (tickets.getId() == id) {
                return tickets;
            }
        }
        return null;
    }

    public void removeByeId(int removeId) {
        Tickets removevingTickets = findById(removeId);
        if (removevingTickets == null) {
            throw new NotFoundException(removeId);

        }

        Tickets[] tmp = new Tickets[tickets.length - 1];
        int result = 0;
        for (Tickets ticket : tickets) {
            if (ticket.getId() == removeId) {
                continue;


            } else {
                tmp[result] = ticket;
                result++;
            }
        }
        tickets = tmp;

    }


}



