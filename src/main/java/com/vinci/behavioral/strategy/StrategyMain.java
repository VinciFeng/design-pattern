package com.vinci.behavioral.strategy;

/**
 * @author Vinci
 * @date 2022/07/20
 */
public class StrategyMain {

    public static void main(String[] args) {
        String StrategyKey = "strategyA";
        IStrategy strategy = StrategyContext.getStrategy(StrategyKey);
        strategy.algorithm();
    }
}
