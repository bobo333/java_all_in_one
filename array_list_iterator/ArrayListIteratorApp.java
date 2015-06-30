import java.util.*;

public class ArrayListIteratorApp {
  public static void main(String[] args) {
    ArrayList<String> nums = new ArrayList<String>();
    nums.add("One");
    nums.add("Two");
    nums.add("Three");
    nums.add("Four");

    String s;
    Iterator e = nums.iterator();

    while (e.hasNext()) {
      s = (String)e.next();     // must cast to string because
                                // iterator returns object, since the Iterable
                                // interface has no idea what object it
                                // is returning before run-time
      System.out.println(s);
    }
  }
}