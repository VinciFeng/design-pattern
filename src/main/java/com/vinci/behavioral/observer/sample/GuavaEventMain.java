package com.vinci.behavioral.observer.sample;

import com.google.common.eventbus.EventBus;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class GuavaEventMain {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("hello");
    }
}
