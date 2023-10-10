import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Linear Equation Calculator!");
        System.out.println("Enter the coordinates of the first point (x, y):");
        String input1 = scanner.nextLine();
        int x1Start = input1.indexOf('(') + 1;
        int x1End = input1.indexOf(',');
        int y1Start = x1End + 1;
        int y1End = input1.indexOf(')');
        double x1 = Double.parseDouble(input1.substring(x1Start, x1End).trim());
        double y1 = Double.parseDouble(input1.substring(y1Start, y1End).trim());


        System.out.println("Enter the coordinates of the second point (x, y):");
        String input2 = scanner.nextLine();
        int x2Start = input2.indexOf('(') + 1;
        int x2End = input2.indexOf(',');
        int y2Start = x2End + 1;
        int y2End = input2.indexOf(')');
        double x2 = Double.parseDouble(input2.substring(x2Start, x2End).trim());
        double y2 = Double.parseDouble(input2.substring(y2Start, y2End).trim());


        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);


        System.out.println(equation.toString());


        System.out.println("Enter an x-coordinate to find the corresponding y-coordinate:");
        double x = scanner.nextDouble();
        double y = equation.getYForX(x);
        System.out.println("Point (" + x + ", " + y + ")");
    }
}
