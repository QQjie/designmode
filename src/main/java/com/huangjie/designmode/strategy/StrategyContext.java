package com.huangjie.designmode.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangjie
 * @version 1.0
 * @description 策略管理上下文
 * @date 2021/7/13 11:32
 */
public class StrategyContext {

    private final Map<String, StrategyService> strategyServiceMap = new HashMap<String, StrategyService>();

    public StrategyService getConcreteStrategy(String key) {
        return strategyServiceMap.get(key);
    }

    public void putConcreteStrategy(String key, StrategyService strategyService) {
        strategyServiceMap.put(key, strategyService);
    }

    public void removeConcreteStrategy(String key) {
        strategyServiceMap.remove(key);
    }

    public void strategyMethod(String key) {
        strategyServiceMap.get(key).strategyMethod();
    }

}
