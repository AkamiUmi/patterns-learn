package fabric_notify;

public class EmailNotifier implements Notifier {
  @Override
  public void notify(String message, String recipient) {
    System.out.println("Sending email to " + recipient + ": " + message);
  }
}
