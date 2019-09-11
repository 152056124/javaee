package com.ztc.impl;


import com.ztc.until.FinalNumber;

public class main {
    public static void main(String[] args) {
        System.out.println(FinalNumber.FIRST_TITLE);
        int i = GenerateTest.generateOneTest();
        System.out.println("你的分数为：" + i);
    }
}
