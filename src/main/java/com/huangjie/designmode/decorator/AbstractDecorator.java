package com.huangjie.designmode.decorator;

import com.huangjie.designmode.factory.AbstractFactory;

/**
 * @author huangjie
 * @version 1.0
 * @description 抽象装饰着
 * @date 2021/7/16 15:48
 */
public abstract class AbstractDecorator implements Component{

    Component component;

    public AbstractDecorator(Component component){
        this.component = component;
    }

    @Override
    public void method() {
        preMethod();
        component.method();
        afterMethod();
    }

    /**
     * 调用前
     */
    abstract void preMethod();

    /**
     * 调用后
     */
    abstract void afterMethod();
}
