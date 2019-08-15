package reflecdemo;

/**
 * 创建一个类的Class模板
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class appleClass1 = Apple.class;
        System.out.println(appleClass1);

        Apple apple = new Apple();
        Class appleClass2 = apple.getClass();
        System.out.println(appleClass2);

        Class appleClass3 = Class.forName("reflecdemo.Apple");
        System.out.println(appleClass3);
    }
}
