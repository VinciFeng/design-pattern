package com.vinci.behavioral.strategy;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Vinci
 * @date 2022/07/19
 */
public class StrategyContext {

    private StrategyContext() {
    }

    private static final ConcurrentHashMap<String, IStrategy> STRATEGIES = new ConcurrentHashMap<>();

    private interface StrategyKey {
        String STRATEGY_A = "strategyA";
        String STRATEGY_B = "strategyB";
    }

    private static final IStrategy DEFAULT = new DefaultStrategy();

    static {
        STRATEGIES.put(StrategyKey.STRATEGY_A, new ConcreteStrategyA());
        STRATEGIES.put(StrategyKey.STRATEGY_B, new ConcreteStrategyB());
    }

    public static IStrategy getStrategy(String strategyKey) {
        IStrategy strategy = STRATEGIES.get(strategyKey);
        return strategy == null ? DEFAULT : STRATEGIES.get(strategyKey);
    }

    public static Set<String> getStrategyKeys() {
        return STRATEGIES.keySet();
    }
}
