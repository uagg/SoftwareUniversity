import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Manager implements Runnable {

    private static final String CMD_END = "End";
    private static final String CMD_CITIZEN = "Citizen";
    private static final String CMD_PET = "Pet";

    private static final Integer IND_CMD = 0;
    private static final Integer IND_NAME = 1;
    private static final Integer IND_CITIZEN_BD = 4;
    private static final Integer IND_PET_BD = 2;

    private InputReader inputReader;

    private List<Birthable> entities;

    public Manager() {
        this.inputReader = new InputReader();
        this.entities = new ArrayList<>();
    }

    @Override
    public void run() {

        while (true) {

            String[] cmdArgs;
            String cmd;

            try {
                cmdArgs = this.inputReader.readCommandLine();
                cmd = cmdArgs[IND_CMD];
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

            if (CMD_END.equals(cmd)) {
                break;
            }

            switch (cmd) {
                case CMD_CITIZEN:
                    this.addCitizen(cmdArgs);
                    break;
                case CMD_PET:
                    this.addPet(cmdArgs);
                    break;
            }
        }

        String filter = "";

        try {
            filter = this.inputReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OutputWriter writer = new OutputWriter(filter, this.entities);
        writer.printOutput();
    }

    private void addPet(String[] args) {
        String name = args[IND_NAME];
        String birthDate = args[IND_PET_BD];

        this.entities.add(new Pet(name, birthDate));
    }

    private void addCitizen(String[] args) {
        String name = args[IND_NAME];
        String birthDate = args[IND_CITIZEN_BD];

        this.entities.add(new Citizen(name, birthDate));
    }
}