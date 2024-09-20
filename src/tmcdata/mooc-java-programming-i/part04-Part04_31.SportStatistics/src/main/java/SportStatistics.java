
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        TeamManager teamManager = new TeamManager();
        FileManager fileManager = new FileManager(teamManager);

        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        fileManager.parseFile(fileName);

        System.out.println("Team:");
        String teamName = scan.nextLine();

        scan.close();

        Team team = teamManager.getTeam(teamName);

        if (team == null) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        } else {
            System.out.println("Games: " + team.getGameCount());
            System.out.println("Wins: " + team.getWinCount());
            System.out.println("Losses: " + team.getLoseCount());
        }


    }

}
