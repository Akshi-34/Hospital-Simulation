public class Alert {
    private Observations observation;
    private int timeRaised;
    private int timeResolved;
    public Alert(Observations obs, int time){
        observation = obs;
        timeRaised = time;
        timeResolved = -1;
        urgent = obs.urgent();
    }
    public void resolve(int time){
        timeResolved = time;
    }
    public String toString(){
        return (urgent ? "[URGENT] " : "[NORMAL] ") +
                "Alert at time " + timeRaised + " resolved at " + timeResolved + ": " + observation.data();
    }
    private boolean urgent;
    public boolean isUrgent() {
        return urgent;
    }
    public int getResolutionTime() {
        if (timeResolved == -1) return -1;
        return timeResolved - timeRaised;
    }
}