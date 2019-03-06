package com.willvi.design.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : ProtoType
 * @Description : 原型模式 必须实现Cloneable接口 否则会报CloneNotSupportedException
 * @Author : WillVi
 * @Date : 2019/3/6 15:14
 * @Version : 1.0
 */
@Data
public class ProtoType implements Cloneable {
    private int i;
    private int j;
    private String s;
    private List<String> list = new ArrayList<String>();

    public ProtoType(){
        this.i = 1;
        this.j = 2;
        this.s = "3";
        this.list.add("123");
    }

    @Override
    public ProtoType clone() {
        ProtoType protoType = null;
        try {
            protoType = (ProtoType) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return protoType;
    }
}
