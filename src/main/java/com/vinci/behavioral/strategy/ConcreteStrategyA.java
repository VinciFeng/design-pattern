package com.vinci.behavioral.strategy;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println(ConcreteStrategyA.class.getSimpleName() + " executed.");
    }
}
