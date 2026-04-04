public class Alert {
    private Observations observation;
    private int timeRaised;
    private int timeResolved;
    public Alert(Observations obs, int time){
        observation = obs;
        timeRaised = time;
        timeResolved = -1;
        urgent = obs.urgent();
        normal = obs.normal();
    }
    public void resolve(int time){
        timeResolved = time;
    }
    public String toString(){
        String alertType=" ";
        if (urgent){
            alertType = "URGENT";
        } else if (normal){
            alertType = "NORMAL";
        }
        return "[" + alertType + "]" + " Alert at time" + timeRaised + " resolved at " + timeResolved + ": " + observation.data();

    }
    private boolean urgent;
    private boolean normal;

    public boolean isUrgent() {
        return urgent;
    }
    public boolean isNormal() {return normal;}

    public int getResolutionTime() {
        if (timeResolved == -1) return -1;
        return timeResolved - timeRaised;
    }
}