package com.willvi.design.structural.bridge;

/**
 * @author wangwei
 * @date 2019/11/5 11:22
 */
public class GeenColor implements Color {

    @Override
    public void bepaint(String name) {
        System.out.println("green " + name);
    }
}
