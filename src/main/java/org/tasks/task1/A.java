package main.java.org.tasks.task1;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 13.02.14
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
public class A extends B {
    public A() {
        this("smth");
    }

    public A(String str) {
        super(str);
    }

    public static void main(String[] args) {
        A a = new A();
    }
}
