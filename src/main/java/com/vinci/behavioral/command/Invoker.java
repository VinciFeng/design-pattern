package com.vinci.behavioral.command;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class Invoker {

    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
