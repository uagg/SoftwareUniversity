import java.util.Map;

public class LieutenantGeneralFactory {

    private static final Integer IND_ID = 1;
    private static final Integer IND_FIRST_NAME = 2;
    private static final Integer IND_LAST_NAME = 3;
    private static final Integer IND_SALARY = 4;
    private static final Integer IND_FIRST_PRIVATE_ID = 5;

    public ILieutenantGeneral createLeutenantGeneral(String[] args, Map<String, IPrivate> privates) {
        String id = args[IND_ID];
        String firstName = args[IND_FIRST_NAME];
        String lastName = args[IND_LAST_NAME];
        Double salary = Double.parseDouble(args[IND_SALARY]);

        ILieutenantGeneral general = new LieutentantGeneral(id, firstName, lastName, salary);

        for (int i = IND_FIRST_PRIVATE_ID; i < args.length; i++) {
            IPrivate priv = privates.get(args[i]);
            general.addPrivate(priv);
        }

        return general;
    }
}