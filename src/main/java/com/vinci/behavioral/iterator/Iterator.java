package com.vinci.behavioral.iterator;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
