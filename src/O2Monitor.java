public class O2Monitor extends Devices {
    public Observations sample(){
        double value = 0.90 + Simulation.random.nextDouble();
        return new O2_Saturation(value);
    }
}