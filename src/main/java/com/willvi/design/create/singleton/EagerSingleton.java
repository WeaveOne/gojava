package com.willvi.design.create.singleton;

/**
 * @author wangwei
 * @date 2019/10/9 11:12
 */
public class EagerSingleton {
    /**
     * 饿汉式
     */
    private static EagerSingleton singleton = new EagerSingleton();
    private EagerSingleton(){

    }
    public static EagerSingleton getInstance() {
        return singleton;
    }
}
