package com.vinci.behavioral.mediator;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueA(this);
    }

    public void selfMethodA() {
        System.out.println(this.getClass().getSimpleName() + ", self-Method");
    }

    public void depMethodA() {
        System.out.println(this.getClass().getSimpleName() + ": depMethod: delegate to Mediator");
        this.mediator.transferA();
    }
}
