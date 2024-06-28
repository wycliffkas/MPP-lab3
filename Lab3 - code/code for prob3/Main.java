public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.computeArea());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder base area: " + cylinder.computeBaseArea());
        System.out.println("Cylinder volume: " + cylinder.computeVolume());
    }
}
