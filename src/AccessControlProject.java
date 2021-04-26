public class AccessControlProject {
    public static void main(String[] args) {
        DistanceSensor distanceSensor = new DistanceSensor();
        distanceSensor.name = "Distanzsensor 1";
        distanceSensor.port = 1;
        System.out.println(distanceSensor.name + " ist am Port " + distanceSensor.port);

        ColorSensor colorSensor = new ColorSensor();
        colorSensor.name = "Farbsensor 1";
        colorSensor.port = 2;
        System.out.println(colorSensor.name + " ist am Port " + colorSensor.port);

        // Datentyp Variable     Konstruktor
        TouchSensor touchSensor1 = new TouchSensor();
        touchSensor1.name = "Taste 1";
        touchSensor1.port = 3;
        System.out.println(touchSensor1.name + " ist am Port " + touchSensor1.port);

        TouchSensor touchSensor2 = new TouchSensor();
        touchSensor2.name = "Taste 2";
        touchSensor2.port = 4;
        System.out.println(touchSensor2.name + " ist am Port " + touchSensor2.port);

        Motor motor = new Motor();
        motor.name = "Motor 1";
        motor.port = "A";
        System.out.println(motor.name + " ist am Port " + motor.port);
    }
}
