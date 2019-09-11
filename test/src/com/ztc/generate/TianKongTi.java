package com.ztc.generate;

import com.ztc.until.FinalNumber;

import java.util.HashMap;
import java.util.Map;


public class TianKongTi {
    public static final Map<String,String[]> tianKongShiTi = new HashMap<>();

    static {

        String[] str1 = {"public","abstract"};
        tianKongShiTi.put("接口的方法默认用什么关键字修饰？[填空，"+ FinalNumber.TIANKONGNTI_FENSHU +"分]",str1);
    }

}
