package com.willvi.design.create.factory;

/**
 * @author wangwei
 * @date 2019/10/12 15:03
 */
public class Pop3Protocol implements NetProtocol{
    @Override
    public void transfer() {
        System.out.println("pop3");
    }
}
