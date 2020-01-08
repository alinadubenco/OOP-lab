import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList <> ();
        GeometricBody sphere = new Sphere (10);
        GeometricBody cub = new Cub (23);
        GeometricBody parallelled = new Parallelepiped (2,6,10);
        geometricBodies.add (sphere);
        geometricBodies.add (cub);
        geometricBodies.add(parallelled);
        System.out.println (Controller.getBiggestSurfacebody (geometricBodies) );
        System.out.println (Controller.getBiggestVolumebody (geometricBodies) );

    }
}