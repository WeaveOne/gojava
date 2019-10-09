package com.willvi.design.create.prototype;

/**
 * @ClassName : Client
 * @Description : 原型模式测试
 * @Author : WillVi
 * @Date : 2019/3/6 15:16
 * @Version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProtoType protoType = new ProtoType();
        ProtoType protoType1 = protoType.clone();
        protoType1.setI(2);
        System.out.println(protoType);
        System.out.println(protoType1);

    }
}
