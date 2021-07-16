package com.huangjie.designmode.observer;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/16 17:04
 */
public class ConcreteSubEvent2Listener implements SubEventListener<SubEvent2> {

    @Override
    public void invoke(Event event) {
        System.out.println("sub event 2  时间监听 go on...");
    }
}
