package singleton.multiThread;

public class DemoMultiThread {
  public static void main(String[] args) {
    System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
      "if you see different value, then 2 singleton were created (booo!)" + "\n\n" +
      "RESULT:" + "\n");
    Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());
    threadFoo.start();
    threadBar.start();
  }

  static class ThreadFoo implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance("FOO");
      System.out.println(singleton.value);
    }
  }

  static class ThreadBar implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance("BAR");
      System.out.println(singleton.value);
    }
  }
}
