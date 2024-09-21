package ru.yterinc.RestApp1.util;

public class PersonNotCratedException extends RuntimeException {
    public PersonNotCratedException(String msg) {
        super(msg);
    }
}
