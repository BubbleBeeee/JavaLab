package lab05.z1;

public class Cube {
    private double a;
    String name;

    public double volume() {
        return Math.pow(a, 3);
    }

    public double area() {
        return 6 * Math.pow(a, 2);
    }

    public void display() {
        System.out.format("Sześcian o nazwie %s o boku %f, z objętością = %f i o polu = %f",
                name, a, volume(), area());
    }

    public Cube(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
