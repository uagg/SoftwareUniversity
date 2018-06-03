public class SpyFactory {

    private static final Integer IND_ID = 1;
    private static final Integer IND_FIRST_NAME = 2;
    private static final Integer IND_LAST_NAME = 3;
    private static final Integer IND_CODE_NUMBER = 4;

    public ISpy createSpy(String[] args) {
        String id = args[IND_ID];
        String firstName = args[IND_FIRST_NAME];
        String lastName = args[IND_LAST_NAME];
        Integer codeNumber = Integer.valueOf(args[IND_CODE_NUMBER]);

        return new Spy(id, firstName, lastName, codeNumber);
    }
}