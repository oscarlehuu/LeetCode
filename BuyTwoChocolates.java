import java.util.Arrays;

public class BuyTwoChocolates {
  public int buyChoco(int[] prices, int money) {
    Arrays.sort(prices);
    int spent = 0;
    int count = 0;
    int leftover = 0;
    for (int price : prices) {
      spent += price;
      count++;
      System.out.println("Choco price: " + price);
      System.out.println("Spent: " + spent);
      System.out.println("Count: " + count);
      System.out.println("--------------");
      if (money - spent >= 0 && count == 2) {
        leftover = money - spent;
        System.out.println("Leftover: " + leftover);
        break;
      } else {
        leftover = money;
      }
    }
    return leftover;
  }

  public static void main(String args[]) {
    int[] prices = { 3,2,3 };
    int money = 3;
    BuyTwoChocolates buyTwoChocolates = new BuyTwoChocolates();
    System.out.println(buyTwoChocolates.buyChoco(prices, money));
  }
}
