public class CallBellObservation extends Observations {
    public boolean urgent() {
        return true;
    }
    public boolean normal() { return false; }
    public String data() {
        return "Call bell pressed";
    }
}