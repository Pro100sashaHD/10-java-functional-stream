package com.example.task05;

public interface Mail<E> {
    String getFrom();
    String getTo();
    E getContent();
}
