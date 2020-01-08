import java.util.ArrayList;

public class Controller {

    public static GeometricBody getBiggestVolumebody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody biggestVolumeBody = geometricBodies.get (0);
        for (int i = 1; i < geometricBodies.size (); i++) {
            if (biggestVolumeBody.getVolume() < geometricBodies.get (i).getVolume()) {
                biggestVolumeBody = geometricBodies.get (i);
            }
        }
        return biggestVolumeBody;
    }

    public static GeometricBody getBiggestSurfacebody(ArrayList<GeometricBody> geometricBodies) {
        GeometricBody biggestSurfaceBody = geometricBodies.get (0);
        for (int i = 1; i < geometricBodies.size (); i++) {
            if (biggestSurfaceBody.getSurface() < geometricBodies.get (i).getSurface()) {
                biggestSurfaceBody = geometricBodies.get (i);
            }
        }
        return biggestSurfaceBody;
    }

}