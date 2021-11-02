

public class Calculations {
    double initialVelocity;
    double initialAngle;

    double initialXVector;
    double initialYVector;

    double maxHeight;
    double maxLength;
    double travelTime;
    double finalVelocity;

    final double gravity = -9.8;

    public void start(double velocity, double angle) {
        initialXVector = velocity*Math.cos(Math.toRadians(angle));
        initialYVector = velocity*Math.sin(Math.toRadians(angle));

        maxHeight = (0-Math.pow(initialYVector,2))/(2*gravity);
        travelTime = (2*-initialYVector) / (gravity);
        maxLength = travelTime*initialXVector;
    }


    public double getMaxHeight() {
        return maxHeight;
    }

    public double getMaxLength() {
        return maxLength;
    }

    public double getTime() {
        return travelTime;
    } 
}