public class Temperature extends Observations{
    public boolean urgent(){
        if ((celsiusValue>=39.5) || (celsiusValue<35)){
            return true;
        }
        return false;
    }
    public boolean normal(){
        if ((celsiusValue>35 && celsiusValue<39.5)){
            return true;
        }
        return false;
    }
    public String data(){return "temp: " + celsiusValue + " C"; }
    public Temperature (double cval) { celsiusValue = cval;}
    private double celsiusValue;
}
