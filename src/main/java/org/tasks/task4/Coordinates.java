package main.java.org.tasks.task4;

public class Coordinates {

  int y = getX();
  int x = 3;

  void setY(int y) {
    y = y;
  }

  int getX() {
    return x;
  }

  public static void main(String args[]) {
    Coordinates c = new Coordinates();
    c.setY(2);
    System.out.println(c.y);
  }
}
