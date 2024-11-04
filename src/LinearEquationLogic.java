import java.util.Scanner;




public class LinearEquationLogic {
    private Scanner myScanner;
    private Coordinate coordinate;


    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
        coordinate = null;
    }


    public void start() {
        System.out.println("Welcome to the linear equation calculator!");
        getInputs();
        boolean loop = true;
        while (loop) {
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            myScanner.nextLine();
            String answer = myScanner.nextLine();
            if (answer.equals("n")) {
                loop = false;
                System.out.println("Thank you for using the slope calculator, goodbye!");
            } else {
                getInputs();
            }

        }
    }


    public void getInputs() {
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = myScanner.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = myScanner.nextLine();


        coordinate = new Coordinate(coordinate1, coordinate2);
        coordinate.parseLogic();


        // check if xs are ==, if so say vert\

        if (coordinate.getX() == coordinate.getA()) {
            System.out.println("These points are on a vertical line: x = " + coordinate.getX());
        } else {
            // else
            LinearEquation linear = new LinearEquation(coordinate.getX(), coordinate.getY(), coordinate.getA(), coordinate.getB());
            System.out.println(linear.lineInfo());
            System.out.println();

            System.out.print("Enter a value for x: ");
            double x = myScanner.nextDouble();
            System.out.println();
            System.out.println("The point on the line is: " + linear.coordinateForX(x));
            System.out.println();
        }
    }
}