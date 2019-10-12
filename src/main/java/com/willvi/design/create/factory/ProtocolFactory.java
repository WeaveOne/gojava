package com.willvi.design.create.factory;

/**
 * @author wangwei
 * @date 2019/10/12 15:12
 * 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，
 * 而简单对象，特别是只需要通过 new 就可以完成创建的对象，
 * 无需使用工厂模式。
 * 如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
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
