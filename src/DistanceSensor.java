import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class DistanceSensor {
    private String name;
    private int port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPort(int port) {
        if (port  >= 1 && port <= 4) {
            this.port = port;
        } else {
            System.out.println("Port " + port + ": ungültige Portnummer");
            System.exit(1);
        }
    }

    boolean isNear(double minDistance, double maxDistance) {
        double distance = getDistance();
        while (!(distance > minDistance && distance < maxDistance)) {
            Util.delay(100);
            distance = getDistance();
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
