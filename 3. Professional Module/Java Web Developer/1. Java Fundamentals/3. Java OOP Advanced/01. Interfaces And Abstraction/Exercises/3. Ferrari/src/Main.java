import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalClassFormatException {
        Scanner sc = new Scanner(System.in);
        String driverName = sc.nextLine();
        Car car = new Ferrari(driverName);
        System.out.printf("%s/%s/%s/%s", car.getModel(), car.useBrakes(), car.useGasPedal(), car.getDriverName());

        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }

    }
}