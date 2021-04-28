import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class DistanceSensor {
    String name;
    int port;

    boolean isNear() {
        return true;
    }

    double getDistance() {
        while (Model.in.getDistance(port) > 2.5 || Model.in.getDistance(port) < 0.03) {
            Util.delay(100);
        }
        return Model.in.getDistance(port);
    }

    double measureDistanceCm() {
        return 0.0;
    }

    double measureDistanceInch() {
        return 0.0;
    }
}
