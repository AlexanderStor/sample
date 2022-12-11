package main.java.org.tasks.task5;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class App {

  private static final Map<Account, LocalDateTime> LAST_LOGINS = new HashMap<>();
  private static final String LANG = "Java";

  public static void main(String[] args) {

    m1();
    m2();
  }

  public static void m1() {
    String myLang = new String(LANG);

    if (myLang == LANG) {
      System.out.println("Java is the same");
    } else {
      System.out.println("Java is not the same");
    }
  }

  public static void m2() {
    Account a = new Account("vip account", "1");

    // user logged in
    LAST_LOGINS.put(a, LocalDateTime.now());

    a.setVip(true);

    // some compliance check

    LocalDateTime lastLogin = LAST_LOGINS.get(a);

    System.out.println(lastLogin);
  }

}
