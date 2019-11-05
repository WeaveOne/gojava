package com.willvi.design.structural.bridge;

/**
 * @author wangwei
 * @date 2019/11/5 11:20
 */
public class RedColor implements Color {
    @Override
    public void bepaint(String name) {
        System.out.println("red " + name);
    }
}
