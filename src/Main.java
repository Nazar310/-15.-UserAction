import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Меню:");
            System.out.println("1. Розрахунок площі трикутника");
            System.out.println("0. Вихід");
            System.out.print("Виберіть пункт меню: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    TriangleCalculator.calculateArea();
                    break;
                case 0:
                    System.out.println("Програма завершена.");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 0);
    }
}
