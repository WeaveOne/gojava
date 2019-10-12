package com.willvi.design.create.factory;

/**
 * @author wangwei
 * @date 2019/10/12 15:12
 */
public class ProtocolFactory {
    public NetProtocol getProtocol(String protocolName) {
        switch (protocolName) {
            case "POP3":
                return new Pop3Protocol();
            case "IMAP":
                return new ImapProtocol();
            case "HTTP":
                return new HttpProtocol();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        ProtocolFactory protocolFactory = new ProtocolFactory();
        NetProtocol http = protocolFactory.getProtocol("HTTP");
        http.transfer();
    }
}
