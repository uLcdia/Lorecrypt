
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    private TeamManager teamManager;

    public FileManager(TeamManager teamManager) {
        this.teamManager = teamManager;
    }

    public void parseLine(String line) {
        String[] parts = line.split(",");
        String team1Name = parts[0];
        String team2Name = parts[1];
        int team1Score = Integer.parseInt(parts[2]);
        int team2Score = Integer.parseInt(parts[3]);

        Team team1 = teamManager.getTeam(team1Name);
        Team team2 = teamManager.getTeam(team2Name);

        if (team1 == null) {
            team1 = new Team(team1Name);
            teamManager.addTeam(team1);
        }
        if (team2 == null) {
            team2 = new Team(team2Name);
            teamManager.addTeam(team2);
        }

        if (team1Score > team2Score) {
            team1.win();
            team2.lose();
        } else {
            team1.lose();
            team2.win();
        }
    }

    public void parseFile(String fileName) {
        try {
            Files.lines(Paths.get(fileName))
                 .forEach(line -> parseLine(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
