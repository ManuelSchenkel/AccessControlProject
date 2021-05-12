import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class Motor {
    private String name;
    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(String port) {
        if (port.equals("A")) {
            this.port = port;
        } else {
            System.out.println("Port " + port + ": ungültige Portnummer");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Motor Name: " + name + ", Port: " + port;
    }

    void openGate() {
        Model.out.rotateTo("A", -180);
        Model.out.setDisplay("Opening gate");
        Model.out.setSpeed("A", 90);
        double duration = 180 / 90;
        for (double i = 0; i < duration ; i = i + 0.1) {
            Util.delay(100);
        }
        Model.out.setDisplay("Gate open");
    }

    void closeGate() {
        Model.out.rotateTo("A", 0);
        Model.out.setDisplay("Closing gate...");
        Model.out.setSpeed("A", 90);
        double duration = 180 / 90;
        for (double i = 0; i < duration ; i = i + 0.1) {
            Util.delay(100);
        }
        Model.out.setDisplay("Gate closed");
    }
}
