abstract class BaseBuyer implements Buyer {

    private Integer food;
    private String name;
    private Integer age;

    private Integer foodModifier;

    protected BaseBuyer(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.food = Buyer.STARTING_FOOD;
    }

    @Override
    public void buyFood() {
        this.food += this.foodModifier;
    }

    @Override
    public Integer getFoodBought() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }

    protected void setFoodModifier(Integer foodModifier) {
        this.foodModifier = foodModifier;
    }
}