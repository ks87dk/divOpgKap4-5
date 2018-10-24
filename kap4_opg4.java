import java.util.Scanner;

public class kap4_opg4 {
    // main method

    /* (Geometry: area of a hexagon) The area of a hexagon can be computed using the
        following formula (s is the length of a side):

        area = 6 * s^2 / 4 * tan(PI / 6)

        Write a program that prompts the user to enter the side of a hexagon and displays
        its area.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of side:");
        double s = input.nextDouble();              // variablen s tildeles parameteren der indtastes

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6)); //arealet beregnes og tildeeles variablen area

        System.out.println("the area of the hexagon is:" + area);



    }
}
