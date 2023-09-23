public class MainThread extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    MainThread thread = new MainThread();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  public void run() {
    amount++;
  }
}

