package singleton;

public class DemoSingleThread {
  public static void main(String[] args) {
    System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
      "if you see different value, then 2 singleton were created (booo!)" + "\n\n" +
      "RESULT:" + "\n");
    Singleton singleton = Singleton.getInstance("FOO");
    Singleton anotherSingleton = Singleton.getInstance("BAR");
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);
  }
}
