/*
Doctor Teminite and his pet - Panda Eyes have created the Highscore – a catalogue, holding the high score results of
players and their game results. The game is in the form of duels, between 2 players, in which each player tries to
score as much as he can.
You will be receiving several lines of input containing information about a duel between 2 players in the following
format: “{player1Score} {player1Name}<->{player2Name} {player2Score}”. See the examples for more info.
The winner of a duel, naturally, is the one with the higher score, and the loser – the one with the lower score.
The winner should add the difference of the two scores to his total score, while the loser should subtract the
difference from his.
Each player has total (high) score, which is the summed up score of all his duels. You must store every player and his
total score, but also, you must store every duel he has had, with information about the opponent and the score the
player has gained, or lost, in the duel with his opponent.
When you receive the command “osu!” you must end the input sequence. When that happens, you must print all the players,
ordered in descending order by their total score. For each player print his name, his score, and all of the duels he
has had, with information about the opponent and the score he gained / lost.
Input
•	The input comes in the form of input lines containing info about a duel between two players in the format,
specified above.
•	The input sequence ends when you receive the command “osu!”.
Output
•	As output you must print all players, ordered in the way specified above.
•	For each player print his name, score and all of his duels in the following format:
-	“{playerName} – ({playerScore})
-	*   {opponent1Name} <-> {gained/lost score}
-	*   {opponent2Name} <-> {gained/lost score}”
•	The prefix for the duels is an asterisk (*) and 3 spaces.
Constrains
•	The scores of the players will be valid integers in range [0, 1.000.000.000].
•	The names of the players will consist only of English Alphabet letters and digits.
•	There will be NO invalid input lines in the input sequence.
•	Data, which has NO specified order of printing, must be printed in order of input.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, LinkedHashMap<String, Long>> playersScores = new LinkedHashMap<>();
        String line = reader.readLine();
        Integer id = 0;

        while(!line.equalsIgnoreCase("osu!")){

            String[] opponents = line.split("<->");
            String firstPlayer = opponents[0].split("\\s+")[1];
            String secondPlayer = opponents[1].split("\\s+")[0];
            Long firstScore = Long.valueOf(opponents[0].split("\\s+")[0]);
            Long secondScore = Long.valueOf(opponents[1].split("\\s+")[1]);

            if (!playersScores.containsKey(firstPlayer)) {
                playersScores.put(firstPlayer, new LinkedHashMap<>());
            }

            id++;

            playersScores.get(firstPlayer).put(secondPlayer+"("+id+")", firstScore - secondScore);

            if (!playersScores.containsKey(secondPlayer)) {
                playersScores.put(secondPlayer, new LinkedHashMap<>());
            }
            playersScores.get(secondPlayer).put(firstPlayer+"("+id+")", secondScore - firstScore);

            id++;
            line = reader.readLine();
        }

        playersScores = playersScores.entrySet().stream().sorted((a,b) -> {
            Long firstScore = getAllScores(a.getValue());
            Long secondScore = getAllScores(b.getValue());

            return Long.compare(secondScore, firstScore);
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue, newValue)->oldValue, LinkedHashMap::new));

        for (Map.Entry<String, LinkedHashMap<String, Long>> player : playersScores.entrySet()) {
            System.out.printf("%s - (%d)%n",player.getKey(), getAllScores(player.getValue()));

            for (Map.Entry<String,Long> oponent : player.getValue().entrySet()) {
                System.out.printf("*   %s <-> %d%n",oponent.getKey().substring(0,oponent.getKey().indexOf("(")), oponent.getValue());
            }
        }

    }

    private static Long getAllScores(LinkedHashMap<String, Long> map) {

        Long result = 0L;
        for (Long integer : map.values()) {
            result += integer;
        }

        return result;
    }
}