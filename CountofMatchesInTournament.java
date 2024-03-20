public class CountofMatchesInTournament {
  public int numberOfMatches(int n) {
    int matches = 0;
    int teamsInAdv = n;
    int matchTotal = 0;
    if (n == 1) return 0;
    while (teamsInAdv != 1 || matches != 1) {
      if (teamsInAdv % 2 == 0) {
        System.out.println("Teams: " + teamsInAdv);
        matches = teamsInAdv / 2;
        teamsInAdv /= 2;
        matchTotal += matches;
        System.out.println("Matches this round: " + matches);
        System.out.println("Teams go to next round: " + teamsInAdv);
        System.out.println("-------------");
      } else if (teamsInAdv % 2 != 0) {
        System.out.println("Teams: " + teamsInAdv);
        matches = (teamsInAdv - 1) / 2;
        teamsInAdv = (teamsInAdv - 1) / 2 + 1;
        matchTotal += matches;
        System.out.println("Matches this round: " + matches);
        System.out.println("Teams go to next round: " + teamsInAdv);
        System.out.println("-----------------");
      }
    }
    System.out.println("Matches total: " + matchTotal);
    return matchTotal;
  }

  public static void main(String args[]) {
    CountofMatchesInTournament countofMatchesInTournament = new CountofMatchesInTournament();
    countofMatchesInTournament.numberOfMatches(1);
  }
}
