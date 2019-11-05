package com.willvi.design.structural.bridge;

/**
 * @author wangwei
 * @date 2019/11/5 11:32
 */
public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor(new RedColor());
        Square square = new Square();
        square.setColor(new GeenColor());
        circle.draw();
        square.draw();
    }
}
