public class Triangle extends Figure implements Printable {

    public Triangle(double a, double b, double c) throws Exception {
        if (!(a < b + c && b < a + c && c < a + b)) {
            throw new Exception("Nie istnieje");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double a;
    double b;
    double c;

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {

        System.out.println("Pole trojkata: " + calculateArea());
        System.out.println("Obwod trojkata: " + calculatePerimeter());

    }
}
