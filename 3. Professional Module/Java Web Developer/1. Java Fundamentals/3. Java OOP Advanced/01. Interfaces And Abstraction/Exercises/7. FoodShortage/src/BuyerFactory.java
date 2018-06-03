final class BuyerFactory {

    private static final Integer IND_NAME = 0;
    private static final Integer IND_AGE = 1;

    private static final Integer IND_CITIZEN_ID = 2;
    private static final Integer IND_CITIZEN_BD = 3;

    private static final Integer IND_REBEL_GROUP = 2;

    Buyer createBuyer(String[] args) {

        Buyer buyer = null;

        if (args.length == 3) {
            buyer = this.createRebel(args);
        } else {
            buyer = this.createCitizen(args);
        }

        return buyer;
    }

    private Buyer createRebel(String[] args) {

        String name = args[IND_NAME];
        Integer age = Integer.parseInt(args[IND_AGE]);
        String group = args[IND_REBEL_GROUP];

        return new Rebel(name, age, group);
    }

    private Citizen createCitizen(String[] args) {
        String name = args[IND_NAME];
        Integer age = Integer.parseInt(args[IND_AGE]);
        String id = args[IND_CITIZEN_ID];
        String birthDate = args[IND_CITIZEN_BD];

        return new Citizen(name, age, id, birthDate);
    }
}