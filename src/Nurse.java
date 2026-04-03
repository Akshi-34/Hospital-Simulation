import java.util.Random;

public class Nurse {
    private Alert currentAlert;
    private Random rand;

    public Nurse(){
        currentAlert = null;
        rand = new Random();
    }

    public void processAlerts(Hospital hospital, int currentTime){
        if (currentAlert != null){
            if (attemptResolution(currentAlert)){
                currentAlert.resolve(currentTime);
                System.out.println(currentAlert);
                currentAlert=null;
            } else {
                return;
            }
        }
        //where the nurse will get her first case/will get a case if she doesn't have one (if she resolved it or if she didn't have one before.
        while (true){
            Alert next = hospital.getNextAlert();

            if (next==null){
                return;
            }

            if(attemptResolution(next)){
                next.resolve(currentTime);
                System.out.println(next);
            } else {
                currentAlert = next;
                return;
            }

        }
    }

    private boolean attemptResolution (Alert alert){
        return rand.nextBoolean();
    }

}
