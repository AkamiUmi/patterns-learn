package singleton;

public class StaticBlockInitialization {
  private static StaticBlockInitialization instance;
  private StaticBlockInitialization() {}
  //static block init for exception handling
  static {
    try {
      instance = new StaticBlockInitialization();
    } catch (Exception e) {
      throw new RuntimeException("Exception occurred in creating singleton instance");
    }
  }

  public static StaticBlockInitialization getInstance() {
    return instance;
  }
}
