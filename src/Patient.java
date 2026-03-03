import java.util.UUID;

public class Patient {
    private UUID identifier;

    public Patient(){
        identifier = UUID.randomUUID();
    }

    static Patient create(){
        return new Patient();
    }

    public UUID getIdentifier(){
        return identifier;
    }
}
