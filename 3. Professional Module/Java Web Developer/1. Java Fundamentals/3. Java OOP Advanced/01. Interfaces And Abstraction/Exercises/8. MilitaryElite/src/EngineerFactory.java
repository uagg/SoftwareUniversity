public class EngineerFactory {

    private static final Integer IND_ID = 1;
    private static final Integer IND_FIRST_NAME = 2;
    private static final Integer IND_LAST_NAME = 3;
    private static final Integer IND_SALARY = 4;
    private static final Integer IND_CORPS = 5;
    private static final Integer IND_FIRST_PART_NAME = 6;

    public IEngineer createEngineer(String[] args) {
        String id = args[IND_ID];
        String firstName = args[IND_FIRST_NAME];
        String lastName = args[IND_LAST_NAME];
        Double salary = Double.parseDouble(args[IND_SALARY]);
        String corps = args[IND_CORPS];

        IEngineer engineer;

        try {
            engineer = new Engineer(id, firstName, lastName, salary, corps);
        } catch (IllegalArgumentException e) {
            return null;
        }

        for (int i = IND_FIRST_PART_NAME; i < args.length - 1; i += 2) {
            String partName = args[i];
            Integer repairHours = Integer.parseInt(args[i + 1]);
            IRepair repair = new Repair(partName, repairHours);

            engineer.addRepair(repair);
        }

        return engineer;
    }
}