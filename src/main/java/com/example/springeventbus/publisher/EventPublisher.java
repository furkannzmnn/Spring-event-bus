package com.example.springeventbus.publisher;

public interface EventPublisher<T> {
    void publish(T applicationEvent);


}
