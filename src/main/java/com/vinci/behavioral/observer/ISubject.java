package com.vinci.behavioral.observer;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public interface ISubject<E> {
    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}
