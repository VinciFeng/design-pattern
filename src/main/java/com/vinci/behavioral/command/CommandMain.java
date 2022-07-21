package com.vinci.behavioral.command;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class CommandMain {
    public static void main(String[] args) {
        ICommand command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
