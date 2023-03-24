import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while(choice != 4) {
        System.out.println("Wybierz opcje: ");
        System.out.println("Opcja 1: Oblicz kwadrat i graniastoslup prawidlowy czwrokatny: ");
        System.out.println("Opcja 2: Oblicz trojkat i graniastoslup prawidlowy trojkatny: ");
        System.out.println("Opcja 3: Oblicz kolo: ");
        System.out.println("Opcja 4: Aby zakonczyc program: ");
        choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Obliczamy Kwadrat i Graniastosłup prawidlowy czworokatny");
                    System.out.println("Podaj dlugosc boku do obliczenia pola i obwodu: ");
                    int a = scanner.nextInt();
                    System.out.println("Podaj wysokosc: ");
                    int h = scanner.nextInt();
                    Square square = new Square(a);
                    Prism prismS = new Prism(square, h);
                    square.print();
                    prismS.print();
                    break;
                case 2:
                    System.out.println("Obliczamy Trojkat i Graniastosłup prawidlowy trojkatny");
                    System.out.println("Podaj dlugosc bokow trojkata do obliczenia pola i obwodu: ");
                    int a1 = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    Triangle triangle = new Triangle(a1, b, c);
                    triangle.print();
                    if (a1 == c && b == c) {
                        System.out.println("Podaj wysokosc: ");
                        int h1 = scanner.nextInt();
                        Prism prismTr = new Prism(triangle, h1);
                        prismTr.print();
                    } else {
                        System.out.println("Niestety trojakt nie jest rownoboczny wiec nie mozna obliczyc graniastoslupa prawidlowego trojkatnego");
                    }
                    break;
                case 3:
                    System.out.println("Obliczamy Kolo");
                    System.out.println("Podaj dlugosc promienia do obliczenia pola i obwodu: ");
                    int r = scanner.nextInt();
                    Circle circle = new Circle(r);
                    circle.print();
                    break;
                default:
                    System.out.println("Koniec programu");
                    break;


            }
        }

    }

}