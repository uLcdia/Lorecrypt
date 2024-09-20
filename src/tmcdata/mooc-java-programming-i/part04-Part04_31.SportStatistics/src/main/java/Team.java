public class Team {
    private String teamName;
    private int gameCount;
    private int winCount;
    private int loseCount;

    public Team(String teamName) {
        this.teamName = teamName;
        this.gameCount = 0;
        this.winCount = 0;
        this.loseCount = 0;
    }

    public Team(String teamName, int gameCount, int winCount, int loseCount) {
        this.teamName = teamName;
        this.gameCount = gameCount;
        this.winCount = winCount;
        this.loseCount = loseCount;
    }

    public Team(String teamName, int winCount, int loseCount) {
        this.teamName = teamName;
        this.winCount = winCount;
        this.loseCount = loseCount;
        this.gameCount = winCount + loseCount;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getGameCount() {
        return this.gameCount;
    }

    public int getWinCount() {
        return this.winCount;
    }

    public int getLoseCount() {
        return this.loseCount;
    } 

    public void win() {
        this.winCount++;
        this.gameCount++;
    }

    public void lose() {
        this.loseCount++;
        this.gameCount++;
    }
}
