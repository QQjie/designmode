package com.huangjie.designmode.factory;

/**
 * @author huangjie
 * @version 1.0
 * @description
 * @date 2021/7/13 13:40
 */
public interface  AbstractFactory {
    /**
     * 生成对象
     * @return 对象
     */
    Product createProduct();
}
