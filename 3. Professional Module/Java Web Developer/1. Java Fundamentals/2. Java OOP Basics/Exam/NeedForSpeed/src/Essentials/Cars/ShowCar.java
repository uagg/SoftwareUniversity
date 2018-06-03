package Essentials.Cars;

public class ShowCar extends Car{
    private static final int DEFAULT_STARS_VALUE = 0;
    int stars = DEFAULT_STARS_VALUE;

    public ShowCar(String inputBrand, String inputModel, int inputYearOfProduction, int inputHorsePower, int inputAcceleration,
                   int inputSuspension, int inputDurability) {
        super(inputBrand, inputModel, inputYearOfProduction, inputHorsePower, inputAcceleration, inputSuspension,
                inputDurability);
    }

    public int getStars() {
        return this.stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}