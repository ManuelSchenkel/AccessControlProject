import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class ColorSensor {
    private String name;
    private int port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Motor Name: " + name + ", Port: " + port;
    }

    public void setPort(int port) {
        if (port  >= 1 && port <= 4) {
            this.port = port;
        } else {
            System.out.println("Port " + port + ": ungültige Portnummer");
            System.exit(1);
        }
    }

    String getColor() {
        while (Model.in.getColor(port) == "keine") {
            Util.delay(100);
            //Thread.sleep(100);
        }
        //System.out.println(Model.in.getColor(port));
        return Model.in.getColor(port);
    }
}
