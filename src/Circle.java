public class Circle extends Figure implements Printable{

    public Circle(double r) throws Exception{
        if(r <= 0){
            throw new Exception("Nie istnieje");
        }
        this.r = r;
    }
    double r;
    @Override
    public double calculateArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*2*r;
    }

    @Override
    public void print() {
        System.out.println("Pole kola: " + calculateArea());
        System.out.println("Obwod kola: " + calculatePerimeter());
    }
}
