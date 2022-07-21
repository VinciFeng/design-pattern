package com.vinci.behavioral.mediator;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void transferA() {
        // 协调行为: A转发到B
        this.colleagueB.selfMethodB();
    }

    @Override
    public void transferB() {
        this.colleagueA.selfMethodA();
    }
}
