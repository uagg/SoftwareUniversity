/*
Heroes III is the best game ever. Everyone loves it and everyone plays it all the time. Stamat is no exclusion to this
rule. His favorite units in the game are all types of dragons – black, red, gold, azure etc… He likes them so much that
he gives them names and keeps logs of their stats: damage, health and armor. The process of aggregating all the data
is quite tedious, so he would like to have a program doing it. Since he is no programmer, it’s your task to help him
You need to categorize dragons by their type. For each dragon, identified by name, keep information about his stats.
Type is preserved as in the order of input, but dragons are sorted alphabetically by name. For each type, you should
also print the average damage, health and armor of the dragons. For each dragon, print his own stats.
There may be missing stats in the input, though. If a stat is missing you should assign it default values. Default
values are as follows: health 250, damage 45, and armor 10. Missing stat will be marked by null.
The input is in the following format {type} {name} {damage} {health} {armor}. Any of the integers may be assigned null
value. See the examples below for better understanding of your task.
If the same dragon is added a second time, the new stats should overwrite the previous ones. Two dragons are considered
equal if they match by both name and type.
Input
•	On the first line, you are given number N -> the number of dragons to follow
•	On the next N lines you are given input in the above described format. There will be single space separating each
element.
Output
•	Print the aggregated data on the console
•	For each type, print average stats of its dragons in format {Type}::({damage}/{health}/{armor})
•	Damage, health and armor should be rounded to two digits after the decimal separator
•	For each dragon, print its stats in format -{Name} -> damage: {damage}, health: {health}, armor: {armor}
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, TreeMap<String, int[]>> allDragons = new LinkedHashMap<>();
        int dragonsCount = Integer.valueOf(bf.readLine());

        enterDragonsAndStats(bf, allDragons, dragonsCount);

        List<String> averageStatsByType = new ArrayList<>();
        calcAverageStatsByType(allDragons, averageStatsByType);

        int index = 0;
        for (Map.Entry<String, TreeMap<String, int[]>> dragons : allDragons.entrySet()) {
            String dragonsType = dragons.getKey();
            TreeMap<String, int[]> allDragonsByCurrentType = dragons.getValue();

            System.out.println(averageStatsByType.get(index));
            for (Map.Entry<String, int[]> dragon : allDragonsByCurrentType.entrySet()) {
                String name = dragon.getKey();
                int damage = dragon.getValue()[0];
                int health = dragon.getValue()[1];
                int armor = dragon.getValue()[2];
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", name, damage, health, armor);
            }

            index++;
        }
    }

    private static void calcAverageStatsByType(Map<String, TreeMap<String, int[]>> allDragons, List<String> averageStatsByType) {
        for (Map.Entry<String, TreeMap<String, int[]>> dragonsByType : allDragons.entrySet()) {
            String dragonsType = dragonsByType.getKey();
            TreeMap<String, int[]> allDragonsByCurrentType = dragonsByType.getValue();

            double averageDamage = 0.0;
            double averageHealth = 0.0;
            double averageArmor = 0.0;

            for (int[] stats : allDragonsByCurrentType.values()) {
                int currentDamage = stats[0];
                int currentHealth = stats[1];
                int currentArmor = stats[2];

                averageDamage += currentDamage;
                averageHealth += currentHealth;
                averageArmor += currentArmor;
            }

            averageDamage /= allDragonsByCurrentType.size();
            averageHealth /= allDragonsByCurrentType.size();
            averageArmor /= allDragonsByCurrentType.size();

            StringBuilder sb = new StringBuilder();
            sb.append(dragonsType + "::(");
            sb.append(String.format("%.2f", averageDamage) + "/");
            sb.append(String.format("%.2f", averageHealth) + "/");
            sb.append(String.format("%.2f", averageArmor) + ")");

            averageStatsByType.add(sb.toString());
        }
    }

    private static void enterDragonsAndStats(BufferedReader bf, Map<String, TreeMap<String, int[]>> allDragons
            , int dragonsCount) throws IOException {

        //damage 45, health 250, and armor 10
        int defaultDamage = 45;
        int defaultHealth = 250;
        int defaultArmor = 10;

        //{type} {name} {damage} {health} {armor}
        for (int index = 0; index < dragonsCount; index++) {
            String[] line = bf.readLine().split("\\s+");
            String dragonType = line[0];
            String dragonName = line[1];
            int damage = "null".equalsIgnoreCase(line[2]) ? defaultDamage : Integer.valueOf(line[2]);
            int health = "null".equalsIgnoreCase(line[3]) ? defaultHealth : Integer.valueOf(line[3]);
            int armor = "null".equalsIgnoreCase(line[4]) ? defaultArmor : Integer.valueOf(line[4]);

            if (!allDragons.containsKey(dragonType)) {
                TreeMap<String, int[]> currentDragon = new TreeMap<>();
                allDragons.put(dragonType, currentDragon);
            }

            TreeMap<String, int[]> dragonsByType = allDragons.get(dragonType);
            if (!dragonsByType.containsKey(dragonName)) {
                int[] currentStats = new int[3];
                dragonsByType.put(dragonName, currentStats);
            }

            int[] stats = {damage, health, armor};
            dragonsByType.put(dragonName, stats);
            allDragons.put(dragonType, dragonsByType);
        }
    }
}