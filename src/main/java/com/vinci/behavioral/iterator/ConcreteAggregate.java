package com.vinci.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class ConcreteAggregate<E> implements IAggregate<E>  {

    private List<E> list = new ArrayList<>();

    @Override
    public boolean add(E element) {
        return list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return list.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<>(this.list);
    }
}
