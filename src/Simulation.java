import java.util.Random;
public class Simulation {
    public static Random random = new Random();

    private Hospital hospital;
    private int currentTime;
    private int maxTime;
    private int timeIncrement;
    private int maxNurses;
    private int maxPatients;



    public Simulation(){
        maxPatients = 20;
        maxTime = 2880; //48 hours
        timeIncrement = 10; //time skips about 10mins each increment
        maxNurses = 5;
        currentTime = 0;
    }

    public void setup(){
        hospital = new Hospital(maxPatients);
        currentTime = 0;

    }

    public void run(){
        while (currentTime < maxTime) {
            currentTime += timeIncrement;
            hospital.update(currentTime);
        }
    }

    public void process(){
        System.out.println("Total patients: " + hospital.getPatientCount());
        System.out.println("Max Capacity: " + hospital.getMaxPatients());

    }

    public Hospital getHospital(){
        return hospital;
    }
}
