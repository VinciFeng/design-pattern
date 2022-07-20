package com.vinci.behavioral.strategy;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class DefaultStrategy implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println(DefaultStrategy.class.getSimpleName() + " executed.");
    }
}
