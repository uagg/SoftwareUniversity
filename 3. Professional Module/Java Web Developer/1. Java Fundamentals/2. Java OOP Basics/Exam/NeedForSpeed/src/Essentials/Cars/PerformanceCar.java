package Essentials.Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerformanceCar extends Car{
    private List<String> addOns;

    public PerformanceCar(String inputBrand, String inputModel, int inputYearOfProduction, int inputHorsePower,
                          int inputAcceleration, int inputSuspension, int inputDurability) {
        super(inputBrand, inputModel, inputYearOfProduction, inputHorsePower, inputAcceleration, inputSuspension,
                inputDurability);
        addOns = new ArrayList<>();
    }

    public List<String> getAddOns() {
        return Collections.unmodifiableList(addOns);
    }

    public void setAddOns(List<String> addOns) {
        this.addOns = addOns;
    }

    void increaseHp() {

    }

    void decreaseSuspension() {

    }
}