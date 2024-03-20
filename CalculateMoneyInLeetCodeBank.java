public class CalculateMoneyInLeetCodeBank {
  public int totalMoney(int n) {
    final int DAYS_IN_WEEK = 7;
    final int SAVING_MONEY_ADD_PER_DAY = 1;
    int mondayMoney = 0;
    int mondayCounts = -1;
    int totalMoney = 0;
    int[] moneyByEachDayArr = new int[n];
    for (int i = 0; i < moneyByEachDayArr.length; i++) {
      if (i % 7 == 0) {
        mondayMoney += 1;
        mondayCounts += 1;
        moneyByEachDayArr[i] = mondayMoney;
      } else {
        //moneyByEachDayArr[i] = mondayMoney + 1 * i;
        if (i <= 7) {
          moneyByEachDayArr[i] = mondayMoney + SAVING_MONEY_ADD_PER_DAY * i;
        } else {
          moneyByEachDayArr[i] = mondayMoney + SAVING_MONEY_ADD_PER_DAY * (i - DAYS_IN_WEEK * mondayCounts);
        }
      }
    }

    for (int i = 0; i < moneyByEachDayArr.length; i++) {
      totalMoney += moneyByEachDayArr[i];
    }
    return totalMoney;
  }

  public static void main(String args[]) {
    CalculateMoneyInLeetCodeBank calculateMoneyInLeetCodeBank = new CalculateMoneyInLeetCodeBank();
    calculateMoneyInLeetCodeBank.totalMoney(20);
  }
}
