package fabric_notify;

public class TelegramNotifier implements Notifier {
  @Override
  public void notify(String message, String recipient) {
    System.out.println("Sending Telegram message to " + recipient + ": " + message);
  }
}
