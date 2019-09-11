package day1;
public class Demo01 {
    static int a = 10;
    int b = 20;
    public void demo(){
        int b = 3;
        System.out.println(a);
    }
    public static void demo1(){
        System.out.println(a);
//        System.out.println(b);
    }
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        d.demo();
    }
}
