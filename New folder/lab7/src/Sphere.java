public class Sphere implements GeometricBody {
    private double raza;
    Sphere(double raza){
        this.raza=raza;

    }
    public double getVolume(){
        return 4/3*Math.PI*Math.pow (raza,3);
    }

    public double getSurface(){
        return 4*Math.PI*Math.pow (raza,2);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "raza=" + raza +
                '}';
    }
}