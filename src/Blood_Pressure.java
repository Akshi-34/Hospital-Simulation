public class Blood_Pressure extends Observations{
    public boolean urgent(){
        if ((Systolic>=180) || Diastolic>=120){
            return true;
        } else if(Systolic>=140 ||  Diastolic>=90){
            return true;
        }
        return false;
    }

    public boolean nonUrgent() {
        if ((Systolic>=120 && Systolic<130) || Diastolic<80){
            return true;
        } else if((Systolic>=130 && Systolic<140) || (Diastolic>=80 && Diastolic<90)){
            return true;
        }
        return false;
    }

    private int Systolic;
    private int Diastolic;

    public String data () {
        return ("Blood Pressure " + Systolic + "/" + Diastolic + " mmHg");
    }
    public Blood_Pressure (int sysVal, int diaVal) {
        Systolic = sysVal;
        Diastolic = diaVal;
    }
}
