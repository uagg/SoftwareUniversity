public class TrafficLight {

    private static final TrafficSignal[] ALL_SIGNALS = TrafficSignal.values();

    private TrafficSignal signal;

    public TrafficLight(TrafficSignal startSignal) {
        this.signal = startSignal;
    }

    public void changeSignal() {
        this.signal = ALL_SIGNALS[(this.signal.ordinal() + 1) % 3];
    }

    @Override
    public String toString() {
        return this.signal.toString();
    }
}
