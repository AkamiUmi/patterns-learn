package fabric_notify;

import java.util.HashMap;
import java.util.Map;

public class NotifyFactory {
  private static final Map<String, Notifier> notifiersMap = new HashMap<>();

  static {
    notifiersMap.put("sms", new SmsNotifier());
    notifiersMap.put("telegram", new TelegramNotifier());
    notifiersMap.put("email", new EmailNotifier());
  }

  public static Notifier getNotifier(String type) {
    Notifier notifier = notifiersMap.get(type);
    if (notifier == null) {
      throw new IllegalArgumentException("No notifier found for type " + type);
    }
    return notifier;
  }
}
