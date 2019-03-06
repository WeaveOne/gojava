package com.willvi.design.proxy.jdk;

/**
 * @ClassName : HelloWorldImpl
 * @Description : TODO
 * @Author : WillVi
 * @Date : 2019/3/1 11:34
 * @Version : 1.0
 */
public class HelloWorldImpl implements IHelloWorld {
    public void sayHello() {
        System.out.println("hello world");
    }
}
