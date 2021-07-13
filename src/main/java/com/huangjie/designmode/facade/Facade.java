package com.huangjie.designmode.facade;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/13 13:56
 */
public class Facade {

    private final SubSystem1 subSystem1 = new SubSystem1();
    private final SubSystem2 subSystem2 = new SubSystem2();
    private final SubSystem3 subSystem3 = new SubSystem3();

    public void method() {
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }
}
