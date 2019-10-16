import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Monitor object1 = new Monitor();
        object1.color = "red";
        object1.dimension1 = 17;
        object1.dimension1 = 23;
        object1.resolution1 = 6500;
        object1.resolution2 = 2015;

        Monitor object2 = new Monitor();
        object2.color = "yellow";
        object2.dimension1 = 56;
        object2.dimension2 = 120;
        object2.resolution1 = 2500;
        object2.resolution2 = 1400;

        object1.compareDimensions(object1,object2);
        object1.compareSolution(object1,object2);

    }


}
