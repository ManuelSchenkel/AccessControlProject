import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class DistanceSensor {
    String name;
    int port;

    boolean isNear(double minDistance, double maxDistance) {
        while (Model.in.getDistance(port) > minDistance || Model.in.getDistance(port) < maxDistance) {
            Util.delay(100);
        }
        return true;
    }

    double getDistance() {
        return Model.in.getDistance(port);
    }

    double measureDistanceCm() {
        return 0.0;
    }

    double measureDistanceInch() {
        return 0.0;
    }
}
