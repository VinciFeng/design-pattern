package com.vinci.behavioral.mediator;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueB(this);
    }

    public void selfMethodB() {
        System.out.println(this.getClass().getSimpleName() + ", self-Method");
    }

    public void depMethodB() {
        System.out.println(this.getClass().getSimpleName() + ": depMethod: delegate to Mediator");
        this.mediator.transferB();
    }
}
