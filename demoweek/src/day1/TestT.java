package day1;

/**
 * 测试泛型
 */
public class TestT<T>{
    public static <T> void demo(T t){
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        String a = "12";
        TestT.demo(a);
    }
}
