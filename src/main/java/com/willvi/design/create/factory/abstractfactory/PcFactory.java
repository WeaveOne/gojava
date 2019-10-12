package com.willvi.design.create.factory.abstractfactory;

import com.willvi.design.create.factory.abstractfactory.dell.DellFactory;
import com.willvi.design.create.factory.abstractfactory.hp.HpFactory;

/**
 * @author wangwei
 * @date 2019/10/12 15:47
 */
public class PcFactory {
    public AbstractPcFactory getPcFactory(String name) {
        switch (name) {
            case "HP": return new HpFactory();
            case "DELL": return new DellFactory();
            default: return null;
        }
    }

    public static void main(String[] args) {
        PcFactory pcFactory = new PcFactory();
        AbstractPcFactory hp = pcFactory.getPcFactory("HP");
        hp.getKeybo().touch();
        hp.getMouse().click();
    }
}
