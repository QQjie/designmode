package com.huangjie.designmode.strategy;

import java.util.function.Consumer;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/13 12:32
 */
public interface StrategyServiceNew<T> {
    /**
     * 函数式策略
     * @param consumer 传入具体的函数式接口
     */
    void strategyMethod(Consumer<T> consumer);
}
