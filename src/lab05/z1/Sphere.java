package lab05.z1;

public class Sphere {
    private double r;
    String name;

    public double volume() {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;
    }

    public double area() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public void display() {
        System.out.format("Kula o nazwie %s o promieniu %f, z objętością = %f i o polu = %f",
                name, r, volume(), area());
    }

    public Sphere(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "r=" + r +
                ", name='" + name + '\'' +
                '}';
    }
}
