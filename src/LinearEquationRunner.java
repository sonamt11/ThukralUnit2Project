import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //welcome and gathering info
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String input1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String input2 = scan.nextLine();

        //parsing the inputs for x- and y-values
        int x1 = Integer.parseInt(input1.substring(input1.indexOf("(") + 1, input1.indexOf(", ")));
        int x2 = Integer.parseInt(input2.substring(input2.indexOf("(") + 1, input2.indexOf(", ")));
        int y1 = Integer.parseInt(input1.substring(input1.indexOf(", ") + 2, input1.indexOf(")")));
        int y2 = Integer.parseInt(input2.substring(input2.indexOf(", ") + 2, input2.indexOf(")")));

        if (x1 == x2) {
            System.out.println("The coordinates you have entered result in a vertical line.\nEquation: x = " + x1);
        } else {
        //creating an object
        LinearEquation math = new LinearEquation(x1, y1, x2, y2);

        //printing line info
        System.out.println("\n----- Line Info -----");
        System.out.println(math.lineInfo());
        System.out.println();

        //printing a coordinate given an x-value
        System.out.println("Enter a value for x: ");
        double x = scan.nextDouble();
        System.out.println();
        math.coordinateForX(x);
        System.out.println("Coordinate for x: " + math.coordinateForX(x));
        }

        scan.close();
    }
}
