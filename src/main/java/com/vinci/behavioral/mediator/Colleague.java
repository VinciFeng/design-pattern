package com.vinci.behavioral.mediator;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
