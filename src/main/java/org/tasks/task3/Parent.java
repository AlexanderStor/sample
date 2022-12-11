package main.java.org.tasks.task3;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 13.02.14
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
public class Parent {
    public Parent(String s){
        print("created");
    }
    public static void print(String s){
        System.out.println("Parent: " + s);
    }
}
