package com.vinci.behavioral.memento;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class MementoMain {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.storeMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
