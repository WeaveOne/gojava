package com.willvi.design.create.factory;


/**
 * @author wangwei
 * @date 2019/10/12 15:10
 */
public class ImapProtocol implements NetProtocol {
    @Override
    public void transfer() {
        System.out.println("IMAP");
    }
}
