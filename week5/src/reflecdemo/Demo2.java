package reflecdemo;

import java.lang.reflect.Field;

/**
 * filed的各种方法
 */
public class Demo2 {
    public static void main(String[] args) {
        demo1();
    }
    public static void demo1(){
        Apple apple = new Apple();
        try {
            Class aClass = Class.forName("reflecdemo.Apple");
//            String simpleName = aClass.getSimpleName();
//            System.out.println(simpleName);
//            System.out.println(aClass.getName());
            Field[] fields = aClass.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field);
                System.out.println(field.getName());
//              Class declaringClass = field.getDeclaringClass();
                if(field.getName().equals("name")){
                    field.set(apple,"15");
                }else {
                    field.set(apple,12);
                }
                Object o = field.get(apple);
                System.out.println(o);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
