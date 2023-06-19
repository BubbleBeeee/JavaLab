package lab05.z1;

public class Cone {
    private double r, h;
    String name;

    public double volume() {
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }

    public double area() {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * Math.hypot(r, h);
    }
}
