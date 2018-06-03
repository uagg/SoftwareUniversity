import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = Integer.parseInt(sc.nextLine());

        Deque<ArrayDeque<Integer>> earthquake = new ArrayDeque<>();

        while (inputCount > 0) {
            inputCount--;

            ArrayDeque<Integer> quakeActivity = Stream.of(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::valueOf).boxed().collect(Collectors.toCollection(ArrayDeque::new));
            earthquake.add(quakeActivity);
        }

        List<Integer> seismicities = new ArrayList<>();

        Deque<ArrayDeque<Integer>> buffer = new ArrayDeque<>();

        while (earthquake.size() != 1) {
            boolean isTouched = false;

            for (int i = 0; i < earthquake.size(); i++) {
                int seismicity = earthquake.get(i).get(0);
                ArrayList<Integer> waves = earthquake.get(i).stream().skip(1).collect(Collectors.toCollection(ArrayList::new));

                if (!isTouched) {
                    for (int j = 0; j < waves.size(); j++) {
                        if (seismicity >= waves.get(j)) {
                            waves.remove(j);
                        }

                        if (seismicity != -999) {
                            seismicities.add(seismicity);
                        }


                        if (seismicity < waves.get(j)) {
                            seismicity = -999;
                            isTouched = true;
                        }
                    }

                    if (seismicity != -999) {
                        waves.add(0, seismicity);
                        isTouched = true;
                    }

                    buffer.add(waves);
                } else {
                    waves.add(0, seismicity);
                    buffer.add(0, waves);
                    seismicities.add(seismicity);
                    isTouched = false;
                }
            }

            earthquake.clear();
            earthquake.addAll(0, buffer);
            buffer.clear();
        }

        int a = 1;
    }
}