package strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard {
  private int amount;
  private String number;
  private String date;
  private String cvv;

  public CreditCard(String number, String date, String cvv) {
    this.amount = 100_000;
    this.number = number;
    this.date = date;
    this.cvv = cvv;
  }

}
