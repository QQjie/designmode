package com.huangjie.designmode.decorator;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/16 15:58
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator(new ConcreteComponent1());
        component.method();
    }
}
