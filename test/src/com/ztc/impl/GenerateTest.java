package com.ztc.impl;

import com.ztc.generate.DanXuanTi;
import com.ztc.generate.DuoXuanTi;
import com.ztc.generate.PanDuanTi;
import com.ztc.generate.TianKongTi;
import com.ztc.until.FinalNumber;
import com.ztc.until.ScnnerUntil;

/**
 * 生成试卷
 */
public class GenerateTest {
    public static int generateOneTest(){
        int num = 0;
        int i1 = ScnnerUntil.eachMap(DanXuanTi.danXuanShiTi, FinalNumber.DANXUANTI_FENSHU);
        int i2 = ScnnerUntil.eachStringMap(TianKongTi.tianKongShiTi, FinalNumber.TIANKONGNTI_FENSHU);
        int i3 = ScnnerUntil.eachMap(PanDuanTi.panDuanhiTi, FinalNumber.PANDUANTI_FENSHU);
        int i4 = ScnnerUntil.eachStringMap(DuoXuanTi.duoXuanShiTi,FinalNumber.DUOXUANTI_FENSHU);
        num = num + i1 + i2 + i3 + i4;
        return num;
    }
}
