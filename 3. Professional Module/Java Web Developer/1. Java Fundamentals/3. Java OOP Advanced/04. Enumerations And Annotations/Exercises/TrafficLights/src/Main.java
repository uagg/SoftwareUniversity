import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TrafficLight[] trafficLights = Stream.of(sc.nextLine().split("\\s+"))
                .map(s -> new TrafficLight(TrafficSignal.valueOf(s.toUpperCase())))
                .toArray(TrafficLight[]::new);

        int signalChanges = Integer.parseInt(sc.nextLine());

        final StringBuilder mainOutput = new StringBuilder();

        while (signalChanges-- > 0) {
            StringBuilder tempOutput = new StringBuilder();

            for (TrafficLight trafficLight : trafficLights) {

                trafficLight.changeSignal();

                tempOutput.append(trafficLight.toString()).append(' ');
            }

            mainOutput.append(tempOutput.toString().trim())
                    .append(System.lineSeparator());
        }

        System.out.println(mainOutput.toString().trim());
    }
}
