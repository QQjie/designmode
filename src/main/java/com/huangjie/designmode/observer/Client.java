package com.huangjie.designmode.observer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/16 16:44
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubEvent1Listener listener1 = new ConcreteSubEvent1Listener();

        ConcreteSubEvent2Listener listener2 = new ConcreteSubEvent2Listener();
        EventMulticaster multicaster = new EventMulticaster();

        multicaster.addListener(listener1);

        multicaster.addListener(listener2);

        Event event = new SubEvent1();
        Event event2 = new SubEvent2();

        multicaster.multicaster(event2);

    }
}
