import java.util.Scanner;

/*
This project is just to do some physics stuff
*/


public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculations calculation = new Calculations();

        System.out.println("Enter magnitude of velocity: ");
        double velocity = scan.nextDouble();
        System.out.println("Enter angle of velocity: ");
        double angle = scan.nextDouble();

        calculation.start(velocity, angle);

        System.out.println("Max Height: " + calculation.getMaxHeight());
        System.out.println("Max Length: " + calculation.getMaxLength());
        System.out.println("Travel Time: " + calculation.getTime());
    }
}