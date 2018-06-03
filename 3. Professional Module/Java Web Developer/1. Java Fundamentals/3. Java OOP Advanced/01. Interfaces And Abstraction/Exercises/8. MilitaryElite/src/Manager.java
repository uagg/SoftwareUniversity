import java.util.LinkedHashMap;
import java.util.Map;

public class Manager implements Runnable {

    private static final String INPUT_PRIVATE = "Private";
    private static final String INPUT_GENERAL = "LeutenantGeneral";
    private static final String INPUT_COMMANDO = "Commando";
    private static final String INPUT_SPY = "Spy";
    private static final String INPUT_ENGINEER = "Engineer";

    private static final String INPUT_END = "End";

    private static final Integer IND_CMD = 0;

    private CommandoFactory commandoFactory;
    private EngineerFactory engineerFactory;
    private LieutenantGeneralFactory generalFactory;
    private PrivateFactory privateFactory;
    private SpyFactory spyFactory;

    private InputReader reader;

    public Manager() {
        this.commandoFactory = new CommandoFactory();
        this.engineerFactory = new EngineerFactory();
        this.generalFactory = new LieutenantGeneralFactory();
        this.privateFactory = new PrivateFactory();
        this.spyFactory = new SpyFactory();

        this.reader = new InputReader();
    }


    @Override
    public void run() {

        String input;
        final StringBuilder OUTPUT = new StringBuilder();
        final Map<String, IPrivate> PRIVATES = new LinkedHashMap<>();

        while (! INPUT_END.equals(input = this.reader.readLine())) {
            String[] args = this.reader.readDataLine(input);

            String cmd = args[IND_CMD];

            try {
                switch (cmd) {
                    case INPUT_COMMANDO:
                        ICommando c = this.commandoFactory.createCommando(args);
                        OUTPUT.append(c.toString()).append(System.lineSeparator());
                        break;
                    case INPUT_ENGINEER:
                        IEngineer e = this.engineerFactory.createEngineer(args);
                        OUTPUT.append(e.toString()).append(System.lineSeparator());
                        break;
                    case INPUT_PRIVATE:
                        IPrivate p = this.privateFactory.createPrivate(args);
                        PRIVATES.put(p.getId(), p);
                        OUTPUT.append(p.toString()).append(System.lineSeparator());
                        break;
                    case INPUT_GENERAL:
                        ILieutenantGeneral g = this.generalFactory.createLeutenantGeneral(args, PRIVATES);
                        OUTPUT.append(g.toString()).append(System.lineSeparator());
                        break;
                    case INPUT_SPY:
                        ISpy s = this.spyFactory.createSpy(args);
                        OUTPUT.append(s.toString()).append(System.lineSeparator());
                        break;
                }
            } catch (Exception e) {}

        }

        System.out.print(OUTPUT.toString().trim());
    }
}