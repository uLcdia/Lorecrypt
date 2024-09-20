import java.util.HashSet;

public class TeamManager {
    private HashSet<Team> teams;

    public TeamManager() {
        this.teams = new HashSet<>();
    }

    public Team getTeam(String teamName) {
        return this.teams.stream()
                         .filter(team -> team.getTeamName().equals(teamName))
                         .findFirst()
                         .orElse(null);
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }
}

/*
 * ZywOO skilled player but that is not normally, 
 * This very very insane....
 * They need to check him pc and game.....
 * Maybe he not cheating but maybe he using the game deficit ...
 * and this cant seem on game screen..
 * He needs to check-up....
 * Day0s FPL Cheater with Streaming.....
 * I think day0s still cheating...
 * Zyw00 using game deficit on PRO scene ,
 * ON BIG Events.Maybe everyone dont knows him trick.
 * He incredible....
 * I want to ask his where is the comming of your skill's ?
 */