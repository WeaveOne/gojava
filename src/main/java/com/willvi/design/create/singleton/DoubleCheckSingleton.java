package com.willvi.design.create.singleton;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author wangwei
 * @date 2019/10/9 11:14
 */
public class DoubleCheckSingleton {
    /**
     * 饿汉式（双重检验）
     */
    private volatile DoubleCheckSingleton singleton = null;
    private DoubleCheckSingleton(){

    }
    public DoubleCheckSingleton getSingleton() {
        if (singleton == null){
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
