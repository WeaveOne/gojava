package com.willvi.design.create.factory.abstractfactory.hp;

import com.willvi.design.create.factory.abstractfactory.Keybo;

/**
 * @author wangwei
 * @date 2019/10/12 15:43
 */
public class HpKeybo implements Keybo {
    @Override
    public void touch() {
        System.out.println("hp keybo");
    }
}
