package com.willvi.hutoll;

import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author wangwei
 * @date 2019/10/21 14:28
 */
public class HutoolDemo {
    public static void main(String[] args) {
        boolean less = NumberUtil.isLess(new BigDecimal(-100), BigDecimal.ZERO);
        System.out.println(less);
        System.out.println(Objects.equals(new BigDecimal(0.03),new BigDecimal(0.03)));
    }
}
