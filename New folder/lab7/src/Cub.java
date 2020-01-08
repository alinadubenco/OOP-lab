public class Cub implements GeometricBody{
    private double lungimea;
    Cub(double lungimea){
        this.lungimea=lungimea;

    }
    public double getVolume(){
        return Math.pow (lungimea,3);
    }

    public double getSurface(){
        return 6*Math.pow (lungimea,2);
    }

    @Override
    public String toString() {
        return "Cub{" +
                "lungimea=" + lungimea +
                '}';
    }
}