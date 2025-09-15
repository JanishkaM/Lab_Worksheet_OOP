package LW01;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Inner Circle");
        Circle innerCircle = new Circle();

        System.out.println("Outer Circle");
        Circle outerCircle = new Circle();

        System.out.println("Outer Circle Area: " + outerCircle.area);
        System.out.println("Inner Circle Area: " + innerCircle.area);

        System.out.println("Ring Area (outer - inner): " + (outerCircle.area - innerCircle.area));
    }
}
