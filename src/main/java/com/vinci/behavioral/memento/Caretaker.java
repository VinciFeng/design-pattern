package com.vinci.behavioral.memento;

/**
 * 管理员
 * @author Vinci
 * @date 2022/07/21
 */
public class Caretaker {

    private IMemento memento;

    public IMemento getMemento() {
        return this.memento;
    }

    public void storeMemento(IMemento memento) {
        this.memento = memento;
    }
}
