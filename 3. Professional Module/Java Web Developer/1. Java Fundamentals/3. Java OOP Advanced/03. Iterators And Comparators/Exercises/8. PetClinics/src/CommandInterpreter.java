import java.util.HashMap;
import java.util.Map;

class CommandInterpreter {

    private static final String DELIMITER = "\\s+";

    private static final String CREATE = "Create";
    private static final String ADD = "Add";
    private static final String RELEASE = "Release";
    private static final String HAS_EMPTY_ROOMS = "HasEmptyRooms";
    private static final String PRINT = "Print";

    private static final String TYPE_PET = "Pet";
    private static final String TYPE_CLINIC = "Clinic";

    private Map<String, Clinic> clinics;
    private Map<String, Pet> pets;

    CommandInterpreter() {
        this.clinics = new HashMap<>();
        this.pets = new HashMap<>();
    }

    void readCommand(String line) {
        String[] args = line.split(DELIMITER);
        String cmd = args[0];

        switch (cmd) {
            case CREATE:
                this.execCreate(args);
                break;
            case ADD:
                this.execAdd(args);
                break;
            case RELEASE:
                this.execRelease(args);
                break;
            case HAS_EMPTY_ROOMS:
                this.execHasEmptyRooms(args);
                break;
            case PRINT:
                this.execPrint(args);
                break;
        }
    }

    private void execPrint(String[] args) {
        String clinicName = args[1];

        switch (args.length) {
            case 2:
                this.clinics.get(clinicName).print();
                break;
            case 3:
                int roomNumber = Integer.parseInt(args[2]) - 1;
                this.clinics.get(clinicName).print(roomNumber);
                break;
        }
    }

    private void execHasEmptyRooms(String[] args) {
        String clinicName = args[1];

        if (! this.clinics.containsKey(clinicName)) {
            System.out.println(Boolean.FALSE);
        } else {
            boolean result = this.clinics.get(clinicName).hasEmptyRooms();
            System.out.println(result);
        }
    }

    private void execRelease(String[] args) {
        String clinicName = args[1];

        boolean result = this.clinics.get(clinicName).release();
        System.out.println(result);
    }

    private void execAdd(String[] args) {
        String petName = args[1];
        String clinicName = args[2];

        Pet pet = this.pets.remove(petName);
        boolean result = this.clinics.get(clinicName).add(pet);

        System.out.println(result);
    }

    private void execCreate(String[] args) {
        String type = args[1];

        switch (type) {
            case TYPE_CLINIC:
                this.execCreateClinic(args);
                break;
            case TYPE_PET:
                this.execCreatePet(args);
                break;
        }
    }

    private void execCreatePet(String[] args) {
        String name = args[2];
        int age = Integer.parseInt(args[3]);
        String kind = args[4];

        Pet pet = new Pet(name, age, kind);
        this.pets.put(name, pet);
    }

    private void execCreateClinic(String[] args) {
        String name = args[2];
        int rooms = Integer.parseInt(args[3]);

        try {
            Clinic clinic = new Clinic(name, rooms);
            this.clinics.put(name, clinic);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}