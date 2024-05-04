import java.util.Scanner;

public class TriangleCalculator {
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину основи трикутника:");
        double base = scanner.nextDouble();
        System.out.println("Введіть висоту трикутника:");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;

        System.out.println("Площа трикутника: " + area);
    }
}
