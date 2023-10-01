package com.example.springeventbus.service;

import com.example.springeventbus.event.BaseEvent;
import com.example.springeventbus.event.CreateOrderEvent;
import com.example.springeventbus.event.EventType;
import com.example.springeventbus.publisher.LocalEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class PayService {

    private final LocalEventPublisher localEventPublisher;

    public void pay() {
        System.out.println("pay");
        localEventPublisher.publish(new CreateOrderEvent(this, UUID.randomUUID(), EventType.CREATE));
    }
}
