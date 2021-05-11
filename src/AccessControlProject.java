import ch.abbts.model.Util;

import java.sql.SQLOutput;

public class AccessControlProject {
    public static void main(String[] args) {

        boolean runAccessControl = true;
        boolean isInRange;
        //Farbe für Zutritt setzen
        String accessColor = "rot";
        //Min. und max. Distanz für Aktivierung des Zutrittsystems
        double minDistance = 0.5;
        double maxDistance = 1.5;

        /*DistanceSensor distanceSensor = new DistanceSensor();
        distanceSensor.name = "Distanzsensor 1";
        distanceSensor.port = 1;*/
        //System.out.println(distanceSensor.name + " ist am Port " + distanceSensor.port);
        //System.out.println(distanceSensor.getDistance());

        ColorSensor colorSensor = new ColorSensor();
        colorSensor.name = "Farbsensor 1";
        colorSensor.port = 2;
        //System.out.println(colorSensor.name + " ist am Port " + colorSensor.port);
        //System.out.println(colorSensor.getColor());

        //Datentyp  Variable       Konstruktor
        TouchSensor touchSensor1 = new TouchSensor();
        touchSensor1.name = "Taste 1";
        touchSensor1.port = 3;
        //System.out.println(touchSensor1.name + " ist am Port " + touchSensor1.port);
        //System.out.println(touchSensor1.isPressed());

        /*System.out.println("vor Touch 3");
        touchSensor1.waitForPressed();
        System.out.println("...nach Touch 3");*/

        TouchSensor touchSensor2 = new TouchSensor();
        touchSensor2.name = "Taste 2";
        touchSensor2.port = 4;
        //System.out.println(touchSensor2.name + " ist am Port " + touchSensor2.port);
        //stem.out.println(touchSensor2.isPressed());
        /*System.out.println("vor Touch 4");
        touchSensor2.waitForPressed();
        System.out.println("...nach Touch 4");*/

        Motor motor = new Motor();
        motor.name = "Motor 1";
        motor.port = "A";
        //System.out.println(motor.name + " ist am Port " + motor.port);

        /*Ablauf Zutritt
        1. Distanz prüfen
        2. Farbe prüfen
        3. Touch 3 öffnet Tor und Touch 4 schliesst Tor
         */
        while (runAccessControl) {
            //nach erstem Durchlauf wird hier immer die da gemessene Distanz verwendet..
            //ausser ich erzeuge das Objekt erst an dieser Stelle und überschreibe es mit jeder Iteration
            //Warum? Liegt das an der Vererbung?
            DistanceSensor distanceSensor = new DistanceSensor();
            distanceSensor.name = "Distanzsensor 1";
            distanceSensor.port = 1;

            isInRange = distanceSensor.isNear(minDistance,maxDistance);
            if (isInRange) {
                System.out.println("System aktiviert");
                System.out.println("Zugangskarte einlesen");
                if (colorSensor.getColor() == accessColor) {
                    System.out.println("Zutritt erteilt");
                    System.out.println("Drücken Sie Touch 3 um das Tor zu öffnen");
                    touchSensor1.waitForPressed();
                    motor.openGate();
                    System.out.println("Drücken Sie Touch 4 um das Tor zu schliessen");
                    touchSensor2.waitForPressed();
                    motor.closeGate();
                } else {
                    System.out.println("Zutritt verweigert");
                    System.out.println("System gesperrt für 5 Sekunden");
                    Util.delay(5000);
                }
            }

        }

        /*
        System.out.println("Touch 3 drücken um Tor zu öffnen");
        touchSensor1.waitForPressed();
        motor.openGate();
        System.out.println("Touch 4 drücken um Tor zu schliessen");
        touchSensor2.waitForPressed();
        motor.closeGate();
        */
    }
}
