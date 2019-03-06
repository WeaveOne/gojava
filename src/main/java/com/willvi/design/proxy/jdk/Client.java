package com.willvi.design.proxy.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName : Client
 * @Description : 代理
 * @Author : WillVi
 * @Date : 2019/3/1 11:35
 * @Version : 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
          // 输出编译后的文件
//        byte[] client$$$$011s = ProxyGenerator.generateProxyClass ("Client$$$$011", new Class[]{HelloWorldImpl.class});
////        FileOutputStream fileOutputStream = new FileOutputStream("Client$$$$011.class");
////        fileOutputStream.write(client$$$$011s);
////        fileOutputStream.close();
        long s = System.currentTimeMillis();
        // 另一种调用方式
//        IHelloWorld helloWorld1 = new HelloWorldImpl();
//        IHelloWorld helloWorld = (IHelloWorld) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class<?>[]{IHelloWorld.class}, new MyInvocationHandler(helloWorld1));
//        helloWorld.sayHello();

            // 1. 生成一个继承Proxy并实现IHelloWorld接口的类
            Class<?> proxyClass = Proxy.getProxyClass(Client.class.getClassLoader(), IHelloWorld.class);
            // 2. 获取入参类型为InvocationHandler 的构造函数
            final Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
            // 3. 实例化InvocationHandler
            final InvocationHandler ih = new MyInvocationHandler(new HelloWorldImpl());
            // 4. 传入参数获取实例对象
            IHelloWorld helloWorld = (IHelloWorld) constructor.newInstance(ih);
            helloWorld.sayHello();
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}
