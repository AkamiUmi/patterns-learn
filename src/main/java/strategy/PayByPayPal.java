package strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
  private static final Map<String, String> DATA_BASE = new HashMap<>();
  private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private String email;
  private String password;
  private boolean signedIn;

  static {
    DATA_BASE.put("amanda1985", "amanda@ya.com");
    DATA_BASE.put("qwerty", "john@amazon.eu");
  }
  @Override
  public boolean pay(int paymentAmount) {
    if (signedIn) {
      System.out.println("Paying " + paymentAmount + " using PayPal.");
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void collectPaymentDetails() {
    try {
      while (!signedIn) {
        System.out.println("Please enter your email address: ");
        email = READER.readLine();
        System.out.println("Please enter your password: ");
        password = READER.readLine();
        if (verify()) {
          System.out.println("Data verified");
        } else {
          System.out.println("Data not verified");
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  private boolean verify() {
    setSignedIn(email.equals(DATA_BASE.get(password)));
    return signedIn;
  }

  private void setSignedIn(boolean signedIn) {
    this.signedIn = signedIn;
  }
}
