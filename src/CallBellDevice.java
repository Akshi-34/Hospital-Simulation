public class CallBellDevice extends Devices {
    private boolean active = false;
    public Observations sample() {
        if (!active && Simulation.random.nextDouble() < 0.005) {
            active = true;
        }
        if (active) {
            return new CallBellObservation();
        }
        return null;
    }
    public void reset() {
        active = false;
    }
}