import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double initialVelocity = scan.nextDouble();
        double angle = scan.nextDouble();
        double height = scan.nextDouble();

        double xVelocity = initialVelocity*Math.cos(Math.toRadians(angle));
        double yVelocity = initialVelocity*Math.sin(Math.toRadians(angle));

        double time = (-yVelocity - Math.sqrt(yVelocity*yVelocity - (4 * (-4.9) *(height)))) / (2*-4.9);
        double distance = xVelocity * time;
        
        System.out.println(distance);
    }
}