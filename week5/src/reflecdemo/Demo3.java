package reflecdemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo3 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        demo();
    }
    public static void demo() throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Class aClass = Apple.class;
        Apple apple = new Apple();
        Apple o = (Apple) aClass.newInstance();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
//            Object invoke = method.invoke(apple, "15");
//            System.out.println(invoke);
        }
    }
}
