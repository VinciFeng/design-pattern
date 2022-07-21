package com.vinci.behavioral.command;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteCommand implements ICommand {

    private Receiver receiver = new Receiver();

    public ConcreteCommand() {
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
