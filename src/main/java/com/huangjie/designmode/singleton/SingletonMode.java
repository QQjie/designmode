package com.huangjie.designmode.singleton;

/**
 * @author huangjie
 * @version 1.0
 * @description 饿汉式
 * @date 2021/7/13 10:39
 */
public class SingletonMode {
    /**
     * 类加载时创建对象
     */
    private static final SingletonMode INSTANCE = new SingletonMode();

    /**
     * 构造函数必须用private修饰，防止new
     */
    private SingletonMode(){

    }

    /**
     * 提供创建对象的方法
     */
    private static SingletonMode getInstance(){
        return INSTANCE;
    }
}
