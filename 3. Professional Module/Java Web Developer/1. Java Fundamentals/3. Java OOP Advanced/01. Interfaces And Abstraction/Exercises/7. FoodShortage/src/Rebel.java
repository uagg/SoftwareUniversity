public final class Rebel extends BaseBuyer implements Buyer {

    private static final Integer FOOD_MOD = 5;

    private String group;

    public Rebel(String name, Integer age, String group) {
        super(name, age);
        this.group = group;
        this.setFoodModifier(FOOD_MOD);
    }

    @Override
    protected void setFoodModifier(Integer foodModifier) {
        super.setFoodModifier(foodModifier);
    }
}