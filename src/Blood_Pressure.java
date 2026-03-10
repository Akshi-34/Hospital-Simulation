public class Blood_Pressure extends Observations{
    public boolean dangerous(){
        if ((Systolic>=120 && Systolic<=129) && Diastolic<80){
            return true;
        } else if((Systolic>=130 && Systolic<=139) || (Diastolic>=80 && Diastolic<=89)){
            return true;
        } else if(Systolic>=140 && Diastolic>=90) {
            return true;
        }
        return false;
    }
    public String data () {
        return ("Blood Pressure " + Systolic + "/" + Diastolic + " mmHg");
    }
    public Blood_Pressure (int sysVal, int diaVal) {
        Systolic = sysVal;
        Diastolic = diaVal;
    }
    private int Systolic;
    private int Diastolic;
}
