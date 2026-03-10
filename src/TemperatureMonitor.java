public class TemperatureMonitor extends Devices {
    public Observations sample(){
        double value = 36 + Simulation.random.nextDouble() * 4;
        return new Temperature(value);
    }
}