package com.huangjie.designmode.observer;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/16 17:04
 */
public class ConcreteSubEvent1Listener implements SubEventListener<SubEvent1> {

    @Override
    public void invoke(Event event) {
        System.out.println("sub event 1  时间监听 go on...");
    }
}
