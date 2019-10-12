package com.willvi.design.create.factory.abstractfactory.hp;

import com.willvi.design.create.factory.abstractfactory.Mouse;

/**
 * @author wangwei
 * @date 2019/10/12 15:42
 */
public class HpMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("hp click");
    }
}
