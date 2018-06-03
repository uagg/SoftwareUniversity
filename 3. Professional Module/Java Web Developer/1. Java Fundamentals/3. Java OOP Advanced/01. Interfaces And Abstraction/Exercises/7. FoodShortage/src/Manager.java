import java.util.HashMap;
import java.util.Map;

final class Manager implements Runnable {

    private static final String CMD_END = "End";

    private final Map<String,Buyer> STORED_ENTITIES;
    private final BuyerFactory BUYER_FACTORY;
    private final InputReader INPUT_READER;

    Manager() {
        this.STORED_ENTITIES = new HashMap<>();
        this.INPUT_READER = new InputReader();
        this.BUYER_FACTORY = new BuyerFactory();
    }

    @Override
    public void run() {

        Integer dataEntries = Integer.parseInt(this.INPUT_READER.readLine());

        while (dataEntries-- > 0) {
            String[] args = this.INPUT_READER.readEntryDataLine();
            Buyer buyer = this.BUYER_FACTORY.createBuyer(args);
            this.STORED_ENTITIES.put(buyer.getName(), buyer);
        }

        String input;

        while (! CMD_END.equals(input = this.INPUT_READER.readLine())) {

            if (this.STORED_ENTITIES.containsKey(input)) {
                this.STORED_ENTITIES.get(input).buyFood();
            }
        }

        this.printFoodData();
    }

    private void printFoodData() {
        System.out.println(
                this.STORED_ENTITIES.values().stream()
                        .mapToInt(Buyer::getFoodBought)
                        .sum()
        );
    }
}