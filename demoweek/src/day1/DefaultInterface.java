package day1;

public interface DefaultInterface {
    void demo2();
    default void demo(){
        System.out.println("a");
    }
}
class DefaultIn implements DefaultInterface{
    public static void main(String[] args) {
        DefaultInterface defaultInterface = new DefaultIn();
        defaultInterface.demo();
    }

    @Override
    public void demo2() {

    }
}
