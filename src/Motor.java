import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class Motor {
    String name;
    String port;

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
