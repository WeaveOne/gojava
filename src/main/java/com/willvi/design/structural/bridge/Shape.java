package com.willvi.design.structural.bridge;

/**
 * @author wangwei
 * @date 2019/11/5 11:22
 */
public abstract class Shape {
    protected Color color;
    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw();
}
