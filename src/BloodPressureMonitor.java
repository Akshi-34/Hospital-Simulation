public class BloodPressureMonitor extends Devices {
    public Observations sample(){
        int sys = Simulation.random.nextInt(60);
        int dia = Simulation.random.nextInt(40);
        return new Blood_Pressure(sys,dia);
    }
}