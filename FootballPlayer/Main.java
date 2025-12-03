public class Main {
    public static void main(String[] args) {
    
        LaligaPlayer messi = new LaligaPlayer("Messi", 30);
        messi.setMonthlySalary(12000);

        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo", 8);
        ronaldo.setMonthlySalary(10000);

        int messiMatches = 15;
        int ronaldoMatches = 8;

      
        System.out.println("Player Name - " + messi.playerName);
        System.out.println("League - LaLiga");
        System.out.println("Goals Scored - " + messi.goals);
        System.out.println("Goal Rate - " + messi.calculateGoalRate(messiMatches));
        System.out.println("Monthly Salary -" + messi.getMonthlySalary());
        System.out.println("-----------------------------------------");
    
        System.out.println("Player Name - " + ronaldo.playerName);
        System.out.println("League - Premier League");
        System.out.println("Goals Count - " + ronaldo.goals);
        System.out.println("Goal Rate - " + ronaldo.calculateGoalRate(ronaldoMatches));
        System.out.println("Monthly Salary - " + ronaldo.getMonthlySalary());
    }
}
