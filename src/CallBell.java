public class CallBell extends Observations {
    public boolean dangerous() {
        return true;
    }
    public String data() {
        return "Call bell pressed";
    }
    public CallBell() {}
public class CallBell extends Devices {
    public Observations sample(){
        if(Simulation.random.nextDouble() < 0.05){
            return new CallBell();
        }
        return null;
    }
}