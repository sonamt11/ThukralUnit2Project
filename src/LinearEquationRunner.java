import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String input1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String input2 = scan.nextLine();

        int x1 = Integer.parseInt(input1.substring(input1.indexOf("(") + 1, input1.indexOf(", ")));
        int x2 = Integer.parseInt(input2.substring(input2.indexOf("(") + 1, input2.indexOf(", ")));
        int y1 = Integer.parseInt(input1.substring(input1.indexOf(", ") + 2, input1.indexOf(")")));
        int y2 = Integer.parseInt(input2.substring(input2.indexOf(", ") + 2, input2.indexOf(")")));

        LinearEquation math = new LinearEquation(x1, y1, x2, y2);

        System.out.println(math.lineInfo());

        System.out.println();
        System.out.println("Enter a value for x: ");
        double x = scan.nextDouble();
        System.out.println();

        math.coordinateForX(x);

        scan.close();
    }
}
