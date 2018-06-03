import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String DELIMITER = " \\| ";

    private static final int IND_NAME = 0;
    private static final int IND_TYPE = 1;
    private static final int IND_POINTS = 2;
    private static final int IND_LVL = 3;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split(DELIMITER);
        String username = tokens[IND_NAME];
        String type = tokens[IND_TYPE];
        String pointsRaw = tokens[IND_POINTS];
        Integer level = Integer.parseInt(tokens[IND_LVL]);

        switch (type) {
            case Archangel.TYPE:
                Integer mana = Integer.valueOf(pointsRaw);
                Champion angel = new Archangel(username, level, mana);
                System.out.println(angel);
                break;
            case Demon.TYPE:
                Double energy = Double.valueOf(pointsRaw);
                Champion demon = new Demon(username, level, energy);
                System.out.println(demon);
                break;
        }
    }
}