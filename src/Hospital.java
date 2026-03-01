public class Hospital{
    private Patient[] patients;
    private int patientCount;
    public Hospital(int maxPatients){
        patients = new Patient[maxPatients];
        patientCount = 0;
    }
    public boolean addPatient(){
        if (patientCount < patients.length){
            patients[patientCount] = Patient.createPatient();
            patientCount++;
            return true;
        }
        return false;
    }
    public Patient getPatient(int index){
        if (index >= 0 && index < patientCount){
            return patients[index];
        }
        return null;
    }
    public int getPatientCount(){
        return patientCount;
    }
    public int maxPatients(){
        return patients.length;
    }
}