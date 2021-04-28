import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class TouchSensor {
    String name;
    int port;

    boolean isPressed() {
        //return true;
        return Model.in.isPressed(port);
    }

    void waitForPressed() {
        while (!isPressed()) {
            Util.delay(100);
            //Thread.sleep(100);
        }
    }
}
