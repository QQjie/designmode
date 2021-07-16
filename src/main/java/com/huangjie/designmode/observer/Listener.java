package com.huangjie.designmode.observer;

import java.lang.reflect.Type;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/16 16:26
 */
public interface Listener {
    /**
     * 事件响应方法
     * @param event 事件类型
     */
    void invoke(Event event);


}
