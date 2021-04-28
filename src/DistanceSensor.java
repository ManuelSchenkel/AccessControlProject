public class DistanceSensor {
    String name;
    int port;

    boolean isNear() {
        return true;
    }

    double readDistance() {
        return 0.0;
    }

    double measureDistanceCm() {
        return 0.0;
    }

    double measureDistanceInch() {
        return 0.0;
    }

}
