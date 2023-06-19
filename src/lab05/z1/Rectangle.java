package lab05.z1;

public class Rectangle {
    private double a, b;
    String name;

    public double area() {
        return a * b;
    }

    public double circ() {
        return 2*a + 2*b;
    }

    public void display() {
        System.out.format("Prostokąt o nazwie %s o bokach %f i %f, z polem = %f i o obwodzie = %f",
                name, a, b, area(), circ());
    }

    public Rectangle(double a, double b, String name) {
        this.a = a;
        this.b = b;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", name='" + name + '\'' +
                '}';
    }
}
