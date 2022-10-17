import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String input1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String input2 = scan.nextLine();


        int x1 = Integer.parseInt(input1.substring(input1.indexOf("(") + 1, input1.indexOf(",")));
        int x2 = Integer.parseInt(input2.substring(input2.indexOf("(") + 1, input2.indexOf(",")));
        int y1 = Integer.parseInt(input1.substring(input1.indexOf(", ") + 1, input1.indexOf(")")));
        int y2 = Integer.parseInt(input2.substring(input2.indexOf(", ") + 1, input2.indexOf(")")));

        LinearEquation math = new LinearEquation(x1, y1, x2, y2);

        System.out.println();
        System.out.println("The two points are: " + input1 + " and " + input2);
//        System.out.println("The equation f the line between these points is: " + math.equation());
//        System.out.println("The slope of this line is: " + math.slope());
//        System.out.println("The y-intercept of the line is: " + math.yIntercept());
//        System.out.println("The distance between the two points is: " + math.distance());
//
//        System.out.println();
//        System.out.println("Enter a value for x: ");
//        System.out.println();
//
//        System.out.println("The point on the line is " + math.);

        scan.close();
    }
}
