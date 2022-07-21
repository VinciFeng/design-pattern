package com.vinci.behavioral.memento;

/**
 * 发起人
 * @author Vinci
 * @date 2022/07/21
 */
public class Originator {

    private String state;

    public void restoreMemento(IMemento memento) {
        this.state = ((Memento) memento).state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    private static class Memento implements IMemento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }
    }
}
