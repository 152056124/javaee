package com.ztc.until;

import java.util.*;

public class ScnnerUntil {
    public static final Scanner scanner = new Scanner(System.in);

    /*
        单选题、填空题、判断题的遍历方法，返回分数
        一个答案，即value为一个String类型
     */
    public static int eachMap(Map shiti,int fenshu){
        Set<Map.Entry<String, String>> entrySet = shiti.entrySet();
        Scanner scanner = ScnnerUntil.scanner;
        int num = 0;
        for (Map.Entry<String, String> stringEntry : entrySet) {
            System.out.println(stringEntry.getKey());
            String s = scanner.nextLine();
            if (s.equals(stringEntry.getValue())){
                num += fenshu;
            }
        }
        return num;
    }
    /*
        多选题，多填空的遍历方法，返回分数
        多个答案，即value为一个String类型数组
        答案顺序不同也可正确判断对错
     */
    public static int eachStringMap(Map shiti,int fenshu){
        Set<Map.Entry<String, String[]>> entrySet = shiti.entrySet();
        Scanner scanner = ScnnerUntil.scanner;
        int num = 0;
        for (Map.Entry<String, String[]> stringEntry : entrySet) {
            System.out.println(stringEntry.getKey());
            String[] value = stringEntry.getValue();
            List<String> nextList = new ArrayList<>();
            for (String s : value) {
                String next = scanner.next();
                nextList.add(next);
            }
            String[] str = new String[nextList.size()];
            String[] str2 = nextList.toArray(str);
            Arrays.sort(value);
            Arrays.sort(str2);
            if(Arrays.equals(value,str2)){
                num += fenshu;
            }
        }

        scanner.nextLine();
        return num;
    }
}
