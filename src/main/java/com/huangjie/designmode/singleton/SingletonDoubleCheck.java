package com.huangjie.designmode.singleton;

/**
 * @author huangjie
 * @version 1.0
 * @description 懒汉式  对象需要的时候进行创建
 * @date 2021/7/13 10:42
 */
public class SingletonDoubleCheck {
    /**
     * 用volatile修饰防止指令重拍
     */
    private static volatile SingletonDoubleCheck instance;

    /**
     * 构造函数必须用private修饰，防止new
     */
    private  SingletonDoubleCheck(){

    }

    /**
     * 提供创建对象的方法
     * 双重校验
     */
    private static SingletonDoubleCheck getInstance(){
        //第一次校验，可提前进行获取，如果已经创建成功直接进行返回
        if (instance==null) {
            synchronized(SingletonDoubleCheck.class){
                //第二次校验防止重复创建对象
                if (instance==null) {
                    return new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
