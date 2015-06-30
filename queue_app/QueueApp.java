import java.util.*;

public class QueueApp {
  public static void main(String[] args) {
    GenQueue<Employee> empList;
    empList = new GenQueue<Employee>();
    GenQueue<HourlyEmployee> hList;
    hList = new GenQueue<HourlyEmployee>();

    hList.enqueue(new HourlyEmployee("Trump", "Donald"));
    hList.enqueue(new HourlyEmployee("Gates", "Bill"));
    hList.enqueue(new HourlyEmployee("Forbes", "Steve"));

    empList.addItems(hList);

    while (empList.hasItems()) {
      Employee emp = empList.dequeue();
      System.out.println(emp.firstName + " " + emp.lastName);
    }
  }
}

class GenQueue<E> {
  private LinkedList<E> list = new LinkedList<E>();

  public void enqueue(E item) {
    list.addLast(item);
  }

  public E dequeue() {
    return list.poll();
  }

  public boolean hasItems() {
    return !list.isEmpty();
  }

  public int size() {
    return list.size();
  }

  public void addItems(GenQueue<? extends E> q) {
    while (q.hasItems())
      list.addLast(q.dequeue());
  }
}

class Employee {
  public String lastName;
  public String firstName;

  public Employee(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }
}

class HourlyEmployee extends Employee {
  public double hourlyRate;

  public HourlyEmployee(String lastName, String firstName) {
    super(lastName, firstName);
  }
}