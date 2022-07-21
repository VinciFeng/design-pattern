package com.vinci.behavioral.observer;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public interface IObserver<E> {

    void update(E event);
}
