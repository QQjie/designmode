package com.huangjie.designmode.singleton;

/**
 * @author huangjie
 * @version 1.0
 * @description 最安全的单例模式 通过枚举的方式获取，枚举不提供构造方法，可防止对象反射的方式进行获取
 * @date 2021/7/13 10:53
 */
public enum  SingletonEnum {
    //单例对象
    INSTANCE;

    private static SingletonEnum getInstance(){
        return INSTANCE;
    }
}
