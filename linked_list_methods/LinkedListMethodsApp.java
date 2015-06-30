import java.util.*;

public class LinkedListMethodsApp {
  public static void main(String[] args) {
    LinkedList<String> officers = new LinkedList<String>();

    officers.add("Blake");
    officers.add("Tuttle");
    officers.add("Burns");
    officers.add("Houlihan");
    officers.add("Pierce");
    officers.add("McIntyre");
    System.out.println(officers);

    // replace Tuttle with Murdock
    officers.set(1, "Murdock");
    System.out.println("\nTuttle was replaced by Murdock:");
    System.out.println(officers);

    // replace Pierce with Hawkeye
    officers.set(officers.indexOf("Pierce"), "Hawkeye");
    System.out.println("\nPierce was replaced by Hawkeye:");
    System.out.println(officers);
  }
}