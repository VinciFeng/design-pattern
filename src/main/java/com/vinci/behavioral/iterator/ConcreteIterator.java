package com.vinci.behavioral.iterator;

import java.util.List;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private List<E> list;

    private int cursor = 0;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        return this.list.get(this.cursor++);
    }

    @Override
    public boolean hasNext() {
        return this.cursor < this.list.size();
    }
}
