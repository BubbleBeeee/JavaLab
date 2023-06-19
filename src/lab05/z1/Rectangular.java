package lab05.z1;

public class Rectangular {
    private double a, b, c;
    String name;

    public double volume() {
        return a * b * c;
    }

    public double area() {
        return 2*a*b + 2*a*c + 2*b*c;
    }

    public void display() {
        System.out.format("Prostopadłościan o nazwie %s o bokach %f, %f i %f, z objętością = %f i o polu = %f",
                name, a, b, c, volume(), area());
    }

    public Rectangular(double a, double b, double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", name='" + name + '\'' +
                '}';
    }
}
