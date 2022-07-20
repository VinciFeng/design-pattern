package com.vinci.behavioral.iterator;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public interface IAggregate<E> {
    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}
