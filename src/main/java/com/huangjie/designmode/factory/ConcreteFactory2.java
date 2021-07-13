package com.huangjie.designmode.factory;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/13 13:47
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }

}
