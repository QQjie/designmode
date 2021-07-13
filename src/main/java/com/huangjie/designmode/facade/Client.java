package com.huangjie.designmode.facade;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/13 13:59
 */
public class Client {
    Facade facade = new Facade();

    public void test() {
        facade.method();
    }
}
