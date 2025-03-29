package fabric_notify;

public class Main {
  public static void main(String[] args) {
    Notifier sms = NotifyFactory.getNotifier("sms");
    sms.notify("bla bla", "123");
    Notifier email = NotifyFactory.getNotifier("email");
    email.notify("bla bla2", "OBAMA");
    Notifier telegram = NotifyFactory.getNotifier("telegram");
    telegram.notify("bla bla3", "TRUMP");
  }
}
