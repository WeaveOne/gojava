package com.willvi.design.create.factory.abstractfactory.dell;

import com.willvi.design.create.factory.abstractfactory.AbstractPcFactory;
import com.willvi.design.create.factory.abstractfactory.Keybo;
import com.willvi.design.create.factory.abstractfactory.Mouse;

/**
 * @author wangwei
 * @date 2019/10/12 15:47
 */
public class DellFactory extends AbstractPcFactory {
    @Override
    public Keybo getKeybo() {
        return new DellKeybo();
    }

    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }
}
