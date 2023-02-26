package ru.netology.tickets;

public class Tickets implements Comparable<Tickets> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int time;

    public Tickets(int id, int price, String from, String to, int time) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public int getId() {
        return id;
    }


    public String getFrom() {
        return from;
    }


    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Tickets o) {

        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;

        }

    }
}



