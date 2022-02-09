
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("File: ");
        String fileName = scan.nextLine();

        System.out.print("Team: ");
        String teamName = scan.nextLine();
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] pieces = line.split(",");

                String homeName = pieces[0];
                String awayName = pieces[1];
                int homeScore = Integer.valueOf(pieces[2]);
                int awayScore = Integer.valueOf(pieces[3]);
                if (homeName.equals(teamName) || awayName.equals(teamName)) {
                    gamesPlayed++;
                }
                if (homeName.equals(teamName)) {
                    // There is no tie
                    if (homeScore > awayScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (awayName.equals(teamName)) {
                    if (awayScore > homeScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
