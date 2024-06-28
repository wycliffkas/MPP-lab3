public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return base.computeArea() * height;
    }

    public double computeBaseArea() {
        return base.computeArea();
    }
}
