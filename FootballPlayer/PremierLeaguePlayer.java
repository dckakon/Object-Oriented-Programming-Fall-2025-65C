class PremierLeaguePlayer extends FootballPlayer {
    public PremierLeaguePlayer(String playerName, int goals) {
        super(playerName, goals);
    }

    @Override
    double calculateGoalRate(int matchesPlayed) {
        return  goals / matchesPlayed;
    }
}
