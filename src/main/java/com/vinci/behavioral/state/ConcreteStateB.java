package com.vinci.behavioral.state;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteStateB extends State {
    @Override
    public void handle() {
        System.out.println("StateB do action");
    }
}
