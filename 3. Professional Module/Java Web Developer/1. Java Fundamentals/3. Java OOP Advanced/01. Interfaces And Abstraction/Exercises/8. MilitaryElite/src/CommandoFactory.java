public class CommandoFactory {
    private static final Integer IND_ID = 1;
    private static final Integer IND_FIRST_NAME = 2;
    private static final Integer IND_LAST_NAME = 3;
    private static final Integer IND_SALARY = 4;
    private static final Integer IND_CORPS = 5;
    private static final Integer IND_FIRST_MISSION_NAME = 6;

    public ICommando createCommando(String[] args) {
        String id = args[IND_ID];
        String firstName = args[IND_FIRST_NAME];
        String lastName = args[IND_LAST_NAME];
        Double salary = Double.parseDouble(args[IND_SALARY]);
        String corps = args[IND_CORPS];

        ICommando commando;

        try {
            commando = new Commando(id, firstName, lastName, salary, corps);
        } catch (IllegalArgumentException e) {
            return null;
        }

        for (int i = IND_FIRST_MISSION_NAME; i < args.length - 1; i += 2) {
            String missionName = args[i];
            String state = args[i + 1];

            try {
                IMission mission = new Mission(missionName, state);
                commando.addMission(mission);

            } catch (IllegalArgumentException e) {}
        }

        return commando;
    }
}