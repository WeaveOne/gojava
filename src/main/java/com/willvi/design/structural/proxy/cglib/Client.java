package com.willvi.design.structural.proxy.cglib;

/**
 * @ClassName : Client
 * @Description : TODO
 * @Author : WillVi
 * @Date : 2019/3/1 14:21
 * @Version : 1.0
 */
public class Client {
    public static void main(String[] args) {

        long s = System.currentTimeMillis();
        for (int i=0; i< 100000; i++){
            HelloCglib helloCglib = (HelloCglib) new MyMethodInterceptor().getProxy(new HelloCglib());
            helloCglib.sayHello();
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}
