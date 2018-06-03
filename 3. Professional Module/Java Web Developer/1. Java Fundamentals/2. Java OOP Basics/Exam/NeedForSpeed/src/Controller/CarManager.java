package Controller;

import Essentials.Cars.Car;
import Essentials.Cars.PerformanceCar;
import Essentials.Cars.ShowCar;
import Essentials.Garage;
import Essentials.Races.CasualRace;
import Essentials.Races.DragRace;
import Essentials.Races.Race;

import java.util.LinkedHashMap;
import java.util.Map;

public class CarManager {
    private Map<Integer, Car> carRegister;
    private Map<Integer, Car> raceRegister;
    private Garage garage;

    public CarManager() {
        this.carRegister = new LinkedHashMap<>();
        this.raceRegister = new LinkedHashMap<>();
        this.garage = new Garage();
    }

    void register(int id, String type, String brand, String model, int yearOfProduction, int horsepower,
                       int acceleration, int suspension, int durability) {
        Car currentCar = null;

        switch (type) {
            case "Performance":
                currentCar = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
            case "Show":
                currentCar = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
        }

        carRegister.put(id, currentCar);
    }

    String check(int id) {
        Car currentCarInPreview = carRegister.get(id);
        return String.format("\"%s %s %d%n%d HP, 100 m/h in %d s%n%d Suspension force, %d Durability\"",
                currentCarInPreview.getBrand(), currentCarInPreview.getModel(),
                currentCarInPreview.getYearOfProduction(), currentCarInPreview.getHorsepower(),
                currentCarInPreview.getAcceleration(), currentCarInPreview.getSuspension(),
                currentCarInPreview.getDurability());
    }

    void open(int id, String type, int length, String route, int prizePool) {
        Race currentRace = null;

        switch (type) {
            case "Casual":
                currentRace = new CasualRace(length, route, prizePool);
                break;
            case "Drag":
                currentRace = new DragRace(length, route, prizePool);
                break;
            case "Drift":
                currentRace = new DragRace(length, route, prizePool);
                break;
        }
    }

    void participate(int carId, int raceId) {
        if(!this.garage.isParked(carId)) {
            this.raceRegister.get(raceId)
        }
    }

    String start(int id) {
        return "1";
    }
    void park(int id) {

    }
    void unpark(int id) {

    }
    void tune(int tuneIndex, String addOn) {

    }
}
