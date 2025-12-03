// Parent Class / Super Class/ Base Class 
abstract class FootballPlayer{
    String playerName;
    int goals;
    private double monthlySalary;  // Encapsulation 

    //Constructur - parameterized 
    public FootballPlayer(String playerName, int goals) {
        this.playerName = playerName;
        this.goals = goals; 
    }
    
    //set method of monthly salary
    public void setMonthlySalary(double monthlySalary) {  
        this.monthlySalary = monthlySalary;
    }

    //get method of monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }
   
    //abstract method - >  No Body 
    abstract double calculateGoalRate(int matchesPlayed);
}
