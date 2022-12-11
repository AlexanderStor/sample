package main.java.org.tasks.task1;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 13.02.14
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
public class C extends B {

    public C() {
        super("string");
        System.out.print("C");
    }

    public static void main(String[] args) {
        C c = new C();

/*        System.out.println("\n"+c.a.toString());
        System.out.println("\n"+c.b.toString());
        System.out.println("\n"+(c.b.equals(c.a)));*/
/*        if(c.a instanceof A){
            System.out.println("c.a instanceof A");
        }
        if(c.a instanceof B){
            System.out.println("c.a instanceof B");
        }
        if(c.a instanceof C){
            System.out.println("c.a instanceof C");
        }*/
    }
}
