package com.willvi.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName : MyMethodInterceptor
 * @Description : TODO
 * @Author : WillVi
 * @Date : 2019/3/1 14:18
 * @Version : 1.0
 */
public class MyMethodInterceptor implements MethodInterceptor {

    public Object getProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("代理结束");
        return invoke;
    }
}
