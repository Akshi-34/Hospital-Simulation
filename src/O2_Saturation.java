public class O2_Saturation extends Observations{
    public boolean urgent(){
        return satValue <= 0.89;
    }
    public boolean nonUrgent(){
        return (satValue<0.92 && satValue>0.89);
    }
    public String data (){ return "O2 Saturation: " + satValue + " SpO2";}
    public O2_Saturation ( double sval) { satValue = sval;}
    private double satValue;
}
