import ch.abbts.model.Model;
import ch.abbts.model.Util;

public class ColorSensor {
    String name;
    int port;

    String getColor() {
        while (Model.in.getColor(port) == "keine") {
            Util.delay(100);
            //Thread.sleep(100);
        }
        //System.out.println(Model.in.getColor(port));
        return Model.in.getColor(port);
    }
}
