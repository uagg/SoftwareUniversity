public final class Citizen extends BaseBuyer implements Buyer {

    private static final Integer FOOD_MOD = 10;

    private String id;
    private String birthDate;

    public Citizen(String name, Integer age, String id, String birthDate) {
        super(name, age);
        this.id = id;
        this.birthDate = birthDate;
        this.setFoodModifier(FOOD_MOD);
    }

    @Override
    protected void setFoodModifier(Integer foodModifier) {
        super.setFoodModifier(foodModifier);
    }
}