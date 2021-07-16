package com.huangjie.designmode.decorator;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/16 15:57
 */
public class ConcreteDecorator extends AbstractDecorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    void preMethod() {
        System.out.println("装饰前调用。。。");
    }

    @Override
    void afterMethod() {
        System.out.println("装饰后调用。。。");
    }
}
