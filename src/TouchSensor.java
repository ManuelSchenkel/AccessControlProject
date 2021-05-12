import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class TouchSensor {
    private String name;
    private int port;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPort(int port) {
        if (port  >= 1 && port <= 4) {
            this.port = port;
        } else {
            System.out.println("Port " + port + ": ungültige Portnummer");
            System.exit(1);
        }
    }

    public String toString() {
        return "TouchSensor Name: " + name + ", Port: " + port;
    }

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
