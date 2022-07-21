package com.vinci.behavioral.mediator;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class MediatorMain {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(mediator);
        concreteColleagueA.depMethodA();
        System.out.println("--------------");
        concreteColleagueB.depMethodB();
    }
}
