package fabric_notify;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class NotifyFactory {
  private static final Map<String, Notifier> notifiersMap = new HashMap<>();

  static {
    ServiceLoader<Notifier> loader = ServiceLoader.load(Notifier.class);
    for (Notifier notifier : loader) {
      System.out.println("Loaded notifier: " + notifier.getClass().getName());
      String key = notifier.getClass().getSimpleName().toLowerCase().replace("notifier", "");
      notifiersMap.put(key, notifier);
    }
  }

  public static Notifier getNotifier(String type) {
    Notifier notifier = notifiersMap.get(type);
    if (notifier == null) {
      throw new IllegalArgumentException("No notifier found for type " + type);
    }
    return notifier;
  }
}
