package com.example.springeventbus.event;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CreateOrderEvent extends BaseEvent{
    public CreateOrderEvent(Object source, final UUID transactionId, final EventType eventType) {
        super(source, transactionId, eventType);
    }
}
