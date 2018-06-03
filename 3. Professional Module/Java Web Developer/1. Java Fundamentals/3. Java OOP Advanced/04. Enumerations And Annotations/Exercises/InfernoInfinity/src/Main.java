import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, Weapon> WEAPONS = new HashMap<>();
    private static final StringBuilder OUTPUT = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while (! "END".equals(input = reader.readLine())) {
            String[] cmdArgs = input.split(";");
            String cmd = cmdArgs[0];

            switch (cmd) {
                case "Create":
                    createWeapon(cmdArgs);
                    break;
                case "Add":
                    addGemToWeapon(cmdArgs);
                    break;
                case "Remove":
                    removeGemFromWeapon(cmdArgs);
                    break;
                case "Print":
                    printWeaponToOutput(cmdArgs);
                    break;
                case "Compare":
                    compareWeaponsAndPrint(cmdArgs);
                    break;
                case "Author":
                    execPrintAuthor();
                    break;
                case "Revision":
                    execPrintRevision();
                    break;
                case "Description":
                    execPrintDescription();
                    break;
                case "Reviewers":
                    execPrintReviewers();
                    break;
            }
        }

        System.out.println(OUTPUT.toString().trim());
    }

    private static void execPrintReviewers() {
        String[] reviewers = Weapon.class
                .getAnnotation(GameClass.class)
                .reviewers();

        OUTPUT.append("Reviewers: ")
                .append(String.join(", ", reviewers))
                .append(System.lineSeparator());
    }

    private static void execPrintDescription() {
        String description = Weapon.class
                .getAnnotation(GameClass.class)
                .description();

        OUTPUT.append("Class description: ").append(description)
                .append(System.lineSeparator());
    }

    private static void execPrintRevision() {
        int revision = Weapon.class
                .getAnnotation(GameClass.class)
                .revision();

        OUTPUT.append("Revision: ").append(revision)
                .append(System.lineSeparator());
    }

    private static void execPrintAuthor() {
        String authorName = Weapon.class
                .getAnnotation(GameClass.class)
                .author();

        OUTPUT.append("Author: ").append(authorName)
                .append(System.lineSeparator());
    }

    private static void compareWeaponsAndPrint(String[] cmdArgs) {
        String firstWeaponName = cmdArgs[1];
        String secondWeapoName = cmdArgs[2];

        Weapon firstWeapon = WEAPONS.get(firstWeaponName);
        Weapon secondWeapon = WEAPONS.get(secondWeapoName);

        Weapon better = firstWeapon.compareTo(secondWeapon) > 0 ?
                firstWeapon : secondWeapon;

        OUTPUT.append(String.format(
                "%s (Item Level: %s)%n",
                better.toString(),
                better.getLevel()));
    }

    private static void printWeaponToOutput(String[] args) {
        String weaponName = args[1];

        Weapon toPrint = WEAPONS.get(weaponName);

        OUTPUT.append(toPrint.toString())
                .append(System.lineSeparator());
    }

    private static void removeGemFromWeapon(String[] args) {
        String weaponName = args[1];
        int socketIndex = Integer.parseInt(args[2]);

        WEAPONS.get(weaponName).removeGem(socketIndex);
    }

    private static void addGemToWeapon(String[] args) {
        String weaponName = args[1];
        int socketIndex = Integer.parseInt(args[2]);
        Gem gem = Gem.valueOf(args[3].toUpperCase());

        WEAPONS.get(weaponName).addGem(socketIndex, gem);
    }

    private static void createWeapon(String[] args) {
        WeaponType type = WeaponType.valueOf(args[1].toUpperCase());
        String name = args[2];

        Weapon weapon = new Weapon(type, name);
        WEAPONS.put(name, weapon);
    }
}