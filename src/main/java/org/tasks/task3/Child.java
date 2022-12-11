package main.java.org.tasks.task3;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 13.02.14
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
public class Child extends Parent {

    public Child() {
        super("created");
    }

    public static void print(String s) {
        System.out.println("Child: " + s);
    }

    public static void main(String[] args) {
        Child child = new Child();
        print("created");
    }
}