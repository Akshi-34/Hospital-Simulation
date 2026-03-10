public class Temperature extends Observations{
    public boolean dangerous(){
        if ((celsiusValue>37.8) || (celsiusValue<35)){
            return true;
        }
        return false;
    }
    public String data(){return "temp: " + celsiusValue + " C"; }
    public Temperature (double cval) { celsiusValue = cval;}
    private double celsiusValue;
}
