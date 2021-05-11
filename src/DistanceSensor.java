import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class DistanceSensor {
    String name;
    int port;

    boolean isNear(double minDistance, double maxDistance) {
        double distance = Model.in.getDistance(port);
        while (!(distance > minDistance && distance < maxDistance)) {
            Util.delay(100);
            distance = Model.in.getDistance(port);
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
