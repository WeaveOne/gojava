package com.willvi.design.create.factory.abstractfactory.dell;

import com.willvi.design.create.factory.abstractfactory.Mouse;

/**
 * @author wangwei
 * @date 2019/10/12 15:46
 */
public class DellMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("dell mouse");
    }
}
