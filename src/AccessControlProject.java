import ch.abbts.model.Util;

public class AccessControlProject {
    public static void main(String[] args) {

        boolean runAccessControl = true;
        boolean isInRange;
        //Farbe für Zutritt setzen
        String accessColor = "rot";
        //Min. und max. Distanz für Aktivierung des Zutrittsystems
        double minDistance = 0.5;
        double maxDistance = 1.5;

        DistanceSensor distanceSensor = new DistanceSensor("Distanzsensor 1", 1);

        ColorSensor colorSensor = new ColorSensor("Farbsensor 1",2);

        TouchSensor touchSensor1 = new TouchSensor("Taste 1", 3);
        TouchSensor touchSensor2 = new TouchSensor("Taste 2", 4);

        Motor motor = new Motor("Motor 1","A");

        /*Ablauf Zutritt
        1. Distanz prüfen
        2. Farbe prüfen
        3. Touch 3 öffnet Tor und Touch 4 schliesst Tor
         */
        while (runAccessControl) {
            //distanceSensor behält die Distanz von dem Punkt an welchem das Feld im GUI verlassen wird
            //damit der Loop funktioniert muss die Max Distanz wieder überschritten werden bevor der Cursor das Feld verlässt
            System.out.println("System bereit");
            isInRange = distanceSensor.isNear(minDistance,maxDistance);
            if (isInRange) {
                System.out.println("System aktiviert");
                System.out.println("Zugangskarte einlesen");
                if (colorSensor.getColor().equals(accessColor)) {
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
    }
}
