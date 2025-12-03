// child class / sub class
class LaligaPlayer extends FootballPlayer {

    // constructor
    public LaligaPlayer(String playerName, int goals) {
        super(playerName, goals);  //  parent class - > constructor
    }

    @Override
    double calculateGoalRate(int matchesPlayed) { 
        return  goals / matchesPlayed;
    }
}