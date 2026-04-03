import java.util.UUID;
public class Patient {
    private UUID identifier;
    private Devices[] devices;
    private int deviceCount;
    public Patient() {
        identifier = UUID.randomUUID();
        devices = new Devices[5];
        deviceCount = 0;
    }
    static Patient create() {
        Patient patient = new Patient();
        patient.addDevice(new TemperatureMonitor());
        patient.addDevice(new BloodPressureMonitor());
        patient.addDevice(new O2Monitor());
        patient.addDevice(new CallBellDevice());

        return patient;
    }
    public void addDevice(Devices device) {
        if (deviceCount < devices.length) {
            devices[deviceCount++] = device;
        }
    }
    public void generateAlerts(Hospital hospital, int currentTime) {
        for (int i = 0; i < deviceCount; i++) {
            Observations obs = devices[i].sample();
            if (obs != null && obs.dangerous()) {
                Alert alert = new Alert(obs, currentTime);
                hospital.addAlert(alert);
            }
        }
    }
    public UUID getIdentifier() {
        return identifier;
    }
}