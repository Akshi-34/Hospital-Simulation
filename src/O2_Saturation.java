public class O2_Saturation extends Observations{
    public boolean dangerous(){
        return satValue < 0.95;
    }
    public String data (){ return "O2 Saturation: " + satValue + " SpO2";}
    public O2_Saturation ( double sval) { satValue = sval;}
    private double satValue;
}
