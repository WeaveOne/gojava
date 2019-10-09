package com.willvi.design.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName : MyInvocationHandler
 * @Description : TODO
 * @Author : WillVi
 * @Date : 2019/3/1 11:39
 * @Version : 1.0
 */
public class MyInvocationHandler implements InvocationHandler {
   
    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始");
        Object invoke = method.invoke(target, args);
        System.out.println("代理结束");
        return invoke;
    }
}
