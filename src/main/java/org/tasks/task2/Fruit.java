package main.java.org.tasks.task2;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 13.02.14
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class Fruit {
    public Fruit() {
        System.out.println("Constructor of Fruit");
    }

    void method() {
        System.out.println("Method of Fruit");
    }

    public static void main(String[] args) {
        Fruit f = new Apple();
        f.method();
    }
}
