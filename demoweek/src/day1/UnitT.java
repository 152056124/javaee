package day1;

public class UnitT<T> {
    public void demo(UnitT<?> a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        UnitT<String> s = new UnitT<>();
        UnitT<Number> n = new UnitT<>();
        n.demo(n);
    }
}
