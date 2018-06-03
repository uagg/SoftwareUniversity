public class PrivateFactory {

    private static final Integer IND_ID = 1;
    private static final Integer IND_FIRST_NAME = 2;
    private static final Integer IND_LAST_NAME = 3;
    private static final Integer IND_SALARY = 4;

    public IPrivate createPrivate(String[] args) {
        String id = args[IND_ID];
        String firstName = args[IND_FIRST_NAME];
        String lastName = args[IND_LAST_NAME];
        Double salary = Double.parseDouble(args[IND_SALARY]);

        return new Private(id, firstName, lastName, salary);
    }
}