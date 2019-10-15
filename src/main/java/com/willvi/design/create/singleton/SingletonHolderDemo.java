package com.willvi.design.create.singleton;

/**
 * @author wangwei
 * @date 2019/10/15 17:22
 */
public class SingletonHolderDemo {
    /**
     * 静态内部类单例
     */
    private static class SingletonHolder{
        private final static SingletonHolderDemo DEMO = new SingletonHolderDemo();
    }
    public SingletonHolderDemo getInstance() {
        return SingletonHolder.DEMO;
    }
}
