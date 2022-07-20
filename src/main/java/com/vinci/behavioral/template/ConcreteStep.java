package com.vinci.behavioral.template;

/**
 * @author Vinci
 * @date 2022/07/19
 */
public class ConcreteStep extends AbstractTemplate {

    @Override
    protected void step1() {
        System.out.println("subclass step1 completed.");
    }
}
