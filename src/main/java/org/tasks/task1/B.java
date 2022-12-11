package main.java.org.tasks.task1;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 13.02.14
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
class B {
    private B() {
        System.out.print("1");
    }

    protected B(String str) {
        System.out.print("2");
    }
}