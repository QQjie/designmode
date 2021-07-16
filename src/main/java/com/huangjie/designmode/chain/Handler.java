package com.huangjie.designmode.chain;

/**
 * @author huangjie
 * @version 1.0
 * @description 抽象的处理类
 * @date 2021/7/16 18:10
 */
public interface Handler {
    /**
     * 处理方法
     * @return 处理结果
     */
    String handle();
}
