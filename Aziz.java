import java.util.Scanner;

public class Aziz extends Shaxzod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Kalkulyatorga xush keibsiz!");
            System.out.print("1-son - ");
            double a = scanner.nextInt();
            System.out.print("Amalni tanlang - ");
            System.out.println(" + ");
            System.out.println(" - ");
            System.out.println(" * ");
            System.out.println(" / ");
            System.out.println(" ^ ");
            String c = scanner.next();
            System.out.print("2-son - ");
            double b = scanner.nextDouble();
            switch (c) {
                case "+" -> qoshish(a, b);
                case "-" -> ayirish(a, b);
                case "*" -> kopaytirish(a, b);
                case "/" -> bolish(a, b);
                case "^" -> pow(a, b);
                default -> System.out.println("Error!");
            }
        }
    }
    public static void qoshish(double a, double b) {
        System.out.println( (long) a + (long) b );
    }
    public static void ayirish(double a, double b) {
        System.out.println( (long) a - (long) b );
    }
    public static void kopaytirish(double a, double b) {
        System.out.println( (long) a * (long) b );
    }
    public static void bolish(double a, double b) {
        System.out.println( (long) a / (long) b );
    }
    public static void pow(double a, double b) {
        System.out.println( Math.pow(a,b) );
    }
}
