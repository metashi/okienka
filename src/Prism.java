public class Prism extends SpatialFigure implements Printable {

    Prism(Figure base, double height) {
        this.base = base;
        this.height = height;
        //this.n = n;
    }

    Figure base;
    double height;
    //double n;

    @Override
    public double calculateSurface() {
        double baseArea = base.calculateArea();
        double lateralArea = base.calculatePerimeter() * height;
        return 2 * baseArea + lateralArea;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * height;
    }

    @Override
    public void print() {

        System.out.println("Pole powierzchni: " + calculateSurface());
        System.out.println("Pole objetosci: " + calculateVolume());
    }
}
