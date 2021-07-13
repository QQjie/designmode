package com.huangjie.designmode.factory;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/13 13:43
 */
public class ConcreteProduct1 implements Product {
    public String value1;

    @Override
    public void show() {
        System.out.println("concrete product 1");
    }
}
