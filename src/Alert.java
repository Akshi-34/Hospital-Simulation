public class Alert {
    private Observations observation;
    private int timeRaised;
    private int timeResolved;
    public Alert(Observations obs, int time){
        observation = obs;
        timeRaised = time;
        timeResolved = -1;
    }
    public void resolve(int time){
        timeResolved = time;
    }
    public String toString(){
        return "Alert at time" + timeRaised + ": " + observation.data();
    }
}