import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter coordinates for a Line:");
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        Line line1 = new Line(x1, y1, x2, y2);

        System.out.println("\nLength of Line: " + line1.calculateLength());

        scanner.close();
    }
}