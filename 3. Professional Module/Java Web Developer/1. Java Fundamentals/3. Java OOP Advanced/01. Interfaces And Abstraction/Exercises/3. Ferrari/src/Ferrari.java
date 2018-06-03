public class Ferrari implements Car {
    private static final String model = "488-Spider";
    private String driverName;

    public Ferrari(String currentDriverName) {
        this.setDriverName(currentDriverName);
    }

    private void setDriverName(String name) {
        this.driverName = name;
    }

    @Override
    public String getDriverName() {
        return this.driverName;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String useBrakes() {
        return Car.brakes;
    }

    @Override
    public String useGasPedal() {
        return Car.gasPedal;
    }
}