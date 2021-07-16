package com.huangjie.designmode.observer;

import com.sun.org.apache.regexp.internal.RE;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huangjie
 * @version 1.0
 * @description 事件广播者
 * @date 2021/7/16 16:24
 */
public class EventMulticaster {

    List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener){
        listeners.add(listener);
    }

    public void removeListener(Listener listener){
        listeners.remove(listener);
    }

    private List<Listener> getListeners(Event event){
        List<Listener> result = new ArrayList<>();
        for (Listener listener : listeners) {
            Type[] genericInterfaces = listener.getClass().getGenericInterfaces();
            for (Type genericInterface : genericInterfaces) {
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type typeArgument : actualTypeArguments) {
                    if (((Class) typeArgument).getName().equals(event.getClass().getName())) {
                        result.add(listener);
                    }
                }
            }
        }
        return result;
    }

    /**
     * 广播事件
     * @param event 事件类型
     */
    public void multicaster(Event event){
        List<Listener> listeners = getListeners(event);
        for (Listener listener : listeners) {
            listener.invoke(event);
        }
    }
}
