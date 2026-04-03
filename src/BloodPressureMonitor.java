public class BloodPressureMonitor extends Devices {
    public Observations sample(){
        int sys = 100 + Simulation.random.nextInt(60);
        int dia = 60 + Simulation.random.nextInt(40);
        return new Blood_Pressure(sys,dia);
    }
}