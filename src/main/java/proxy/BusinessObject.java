package proxy;

public abstract class BusinessObject {
  public abstract void sayHi();
  public static BusinessObject create() {
    return new BusinessObjectProxy(new BusinessObjectImplementation());
  }
}
