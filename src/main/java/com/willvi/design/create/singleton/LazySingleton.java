package com.willvi.design.create.singleton;

/**
 * @author wangwei
 * @date 2019/10/9 11:06
 */
public class LazySingleton {
    /**
     * 懒汉式：在需要时加载（线程不安全）
     */
    private static LazySingleton singleton = null;
    private LazySingleton(){

    }
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
