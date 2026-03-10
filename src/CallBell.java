public class CallBell extends Devices {
    public Observations sample(){
        if(Simulation.random.nextDouble() < 0.05){
            return new CallBell();
        }
        return null;
    }
}