package com.vinci.behavioral.observer;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(E event) {
        System.out.println("receive event: " + event);
    }
}
