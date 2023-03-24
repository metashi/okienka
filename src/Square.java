public class Square extends Figure implements Printable{
    public Square(int a) throws Exception{
        if(a <= 0){
            throw new Exception("Nie istnieje");
        }
        this.a = a;
    }
    int a;
    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println("Pole kwadratu: " + calculateArea());
        System.out.println("Obwod kwadratu: " + calculatePerimeter());
    }
}
