public class BloodPressure extends Observations {
    public boolean dangerous(){
        if ((systolic > 180) || (systolic < 80) || (diastolic > 120)){
            return true;
        }
        return false;
    }
    public String data(){
        return "blood pressure: " + systolic + "/" + diastolic;
    }
    public BloodPressure(int sys, int dia){
        systolic = sys;
        diastolic = dia;
    }
    private int systolic;
    private int diastolic;

}