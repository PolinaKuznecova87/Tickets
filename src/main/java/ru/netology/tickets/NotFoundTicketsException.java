package ru.netology.tickets;

public class NotFoundTicketsException extends RuntimeException {
    public NotFoundTicketsException(String msg) {
        super(msg);
    }
}

