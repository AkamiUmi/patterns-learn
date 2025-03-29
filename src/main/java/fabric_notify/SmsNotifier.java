package fabric_notify;

public class SmsNotifier implements Notifier {
  @Override
  public void notify(String message, String recipient) {
    System.out.println("Sending sms to " + recipient + ": " + message);
  }
}
