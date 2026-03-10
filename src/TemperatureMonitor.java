public class TemperatureMonitor extends Devices {
    public Observations sample(){
        double value = Simulation.random.nextDouble();
        return new Temperature(value);
    }
}