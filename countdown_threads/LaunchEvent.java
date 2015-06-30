// implementing the Runnable interface allows
// a class to be run like a thread. It is more
// flexible than inheriting straight from the Thread class
// so it can have sub-classes that inherit from it
// instead of the Thread class

public class LaunchEvent implements Runnable {
  private int start;
  private String message;

  public LaunchEvent(int start, String message) {
    this.start = start;
    this.message = message;
  }

  public void run() {
    try {
      Thread.sleep(20000 - (this.start * 1000));
    } catch (InterruptedException e) {}
    System.out.println(this.message);
  }
}