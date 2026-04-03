public class O2Monitor extends Devices {
    public Observations sample(){
        double value = 0.90 + Simulation.random.nextDouble() * 0.08;
        return new O2_Saturation(value);
    }
}