package com.example.springeventbus.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;
import java.util.UUID;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
public abstract class BaseEvent extends ApplicationEvent {
    private final UUID transactionId;
    private final EventType eventType;

    public BaseEvent(Object source, UUID transactionId, EventType eventType) {
        super(source);
        this.transactionId = transactionId;
        this.eventType = eventType;
    }
}
