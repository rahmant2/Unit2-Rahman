import java.text.DecimalFormat;
public class LinearEquation {
    private double x1, y1, x2, y2;


    public LinearEquation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double getSlope() {
         return ((double) (y2 - y1) / (double)(x2 - x1));

    }


    public double getYIntercept() {
        double slope = getSlope();
        return (double) (y1 - slope * x1);
    }


    public String getLinearEquation() {
        double slope = getSlope();
        double yIntercept = getYIntercept();
        return "y = " + formatFraction(slope) + "x + " + yIntercept;
    }


    public double getDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public double getYForX(double x) {
        double slope = getSlope();
        double yIntercept = getYIntercept();
        return slope * x + yIntercept;
    }


    private String formatFraction(double value) {
        if (value % 1 == 0) {
            return String.valueOf((int) value);
        }
        return String.valueOf(value);
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Points: (" + df.format(x1) + ", " + df.format(y1) + ") and (" +
                df.format(x2) + ", " + df.format(y2) + ")\n" +
                "Linear Equation: " + getLinearEquation() + "\n" +
                "Slope: " + formatFraction(getSlope()) + "\n" +
                "Y-Intercept: " + df.format(getYIntercept()) + "\n" +
                "Distance between points: " + df.format(getDistance());
    }
}
