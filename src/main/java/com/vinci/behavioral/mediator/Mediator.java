package com.vinci.behavioral.mediator;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public abstract class Mediator {

    protected ConcreteColleagueA colleagueA;

    protected ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public abstract void transferA();

    public abstract void transferB();
}
