package com.vinci.behavioral.state;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteStateA extends State {
    @Override
    public void handle() {
        System.out.println("StateA do action");
        this.context.setState(Context.STATE_B);
        this.context.getState().handle();
    }
}
