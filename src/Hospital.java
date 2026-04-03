public class Hospital {
    private Patient[] patients;
    private int patientCount;
    private Nurse[] nurses;
    private int nurseCount;
    private Queue urgentQueue;
    private Queue normalQueue;
    public Hospital(int maxPatients, int numNurses) {
        patients = new Patient[maxPatients];
        patientCount = 0;
        nurses = new Nurse[numNurses];
        nurseCount = numNurses;
        for (int i = 0; i < numNurses; i++) {
            nurses[i] = new Nurse();
        }
        urgentQueue = new Queue();
        normalQueue = new Queue();
    }
    public void addPatient() {
        if (patientCount < patients.length) {
            patients[patientCount] = Patient.create();
            patientCount++;
        }
    }
    public Patient getPatient(int i) {
        if (i >= 0 && i < patientCount) {
            return patients[i];
        }
        return null;
    }
    public int getPatientCount() {
        return patientCount;
    }
    public int getMaxPatients() {
        return patients.length;
    }
    public void addAlert(Alert alert) {
        if (alert.isUrgent()) {
            urgentQueue.enqueue(alert);
        } else {
            normalQueue.enqueue(alert);
        }
    }
    public Alert getNextAlert() {
        Alert a = urgentQueue.dequeue();
        if (a != null) return a;
        return normalQueue.dequeue();
    }
    public void update(int currentTime) {
        for (int i = 0; i < patientCount; i++) {
            patients[i].generateAlerts(this, currentTime);
        }
        for (int i = 0; i < nurseCount; i++) {
            nurses[i].processAlerts(this, currentTime);
        }
    }
}