import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        // Equipes de tests
        List<Team> teams = new ArrayList<Team>();
        teams.add(new Team("Red1", "Red2", "Red3", "Red4", "Red5", "Red6"));
        teams.add(new Team("Blue1", "Blue2", "Blue3"));
        teams.add(new Team("Green1"));
        teams.add(new Team("Yellow1"));
        teams.add(new Team("Purple1", "Purple2", "Purple3", "Purple4", "Purple5", "Purple6"));

        /*
        * Début
        */
        //Calcul du nombre de joueurs minimum par teams
        int playerPerTeams = totalPlayers(teams) / teams.size();
     
        //Equilibrage
        for(Team t : teams)
            t.balance(teams, playerPerTeams);
     
        /*
        * Fin
        */

        //Verification
        int i = 0;
        for(Team team : teams)
            System.out.println("Team" + ++i + ": " + String.join(", ", team.getPlayers()));
    }

    public static int totalPlayers(List<Team> teams)
    {
        int ret = 0;
        for(Team t : teams)
            ret += t.getPlayers().size();
        return ret;
    }
}