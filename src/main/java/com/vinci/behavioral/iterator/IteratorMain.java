package com.vinci.behavioral.iterator;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class IteratorMain {

    public static void main(String[] args) {
        IAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("one");
        aggregate.add("two");
        aggregate.add("three");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
