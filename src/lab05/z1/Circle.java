package lab05.z1;

public class Circle {
    private double r;
    String name;

    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    public double circ() {
        return 2 * Math.PI * r;
    }

    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public void display() {
        System.out.format("Koło o nazwie %s o promieniu %f, z polem = %f i o obwodzie = %f",
                name, r, area(), circ());
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
        return "Circle{" +
                "r=" + r +
                ", name='" + name + '\'' +
                '}';
    }
}
