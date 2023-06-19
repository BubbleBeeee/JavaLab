package lab05.z1;

public class Square {
    private double a;
    String name;

    public double area() {
        return Math.pow(a, 2);
    }

    public double circ() {
        return 4 * a;
    }

    public Square(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public void display() {
        System.out.format("Kwadrat o nazwie %s o boku %f, z polem = %f i o obwodzie = %f",
                name, a, area(), circ());
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
        return "Square{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
