import java.text.DecimalFormat;
public class LinearEquation {
    //declaring instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //constructor to initialize instance variables
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //returns a calculated distance between two points
    public double distance() {
        return roundedToHundredth(Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
    }

    //returns the y-intercept of the line formed by the two points
    public double yIntercept() {
        return roundedToHundredth(y1 - x1 * slope());
    }

    //returns the slope of the line formed by the two points
    public double slope() {
        if ((double)(y2 - y1) / (x2 - x1) == 0) {     //if statement used so 0.0/0.0 and -0.0/0.0 are printed as 0.0
            return 0.0;
        } else {
            return roundedToHundredth((double)(y2 - y1) / (x2 - x1));
        }
    }

    //returns the equation of the line formed by the two points
    //the equation is based on the y-intercept and slope
    public String equation() {
        if (((slope()) * 10) % 10 == 0) { //if the slope is an integer
            if (yIntercept() > 0) {
                if (slope() == 1) {
                    return "y = x + " + yIntercept();
                } else if (slope() == 0) {
                    return "y = " + (int) (yIntercept());
                } else if (slope() == -1) {
                    return "y = -x + " + yIntercept();
                } else {
                    return "y = " + (int) (slope()) + "x + " + yIntercept();
                }
            } else if (yIntercept() == 0) {
                if (slope() == 1) {
                    return "y = x";
                } else if (slope() == 0) {
                    return "y = " + (int)(yIntercept());
                } else if (slope() == -1) {
                    return "y = -x";
                } else {
                    return "y = " + (int) (slope()) + "x";
                }
            } else {
                if (slope() == 1) {
                    return "y = x - " + Math.abs(yIntercept());
                } else if (slope() == 0) {
                    return "y = -" + (int) Math.abs(yIntercept());
                } else if (slope() == -1) {
                    return "y = -x - " + Math.abs(yIntercept());
                } else {
                    return "y = " + (int) (slope()) + "x - " + Math.abs(yIntercept());
                }
            }
        } else { //if the slope is not an integer
            if (yIntercept() > 0) {
                if ((y2 - y1) < 0 && (x2 - x1) < 0) {
                    return "y = (" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + ")x + " + Math.abs(yIntercept());
                } else if ((x2 - x1) < 0) {
                    return "y = (-" + (y2 - y1) + "/" + Math.abs(x2 - x1) + ")x + " + Math.abs(yIntercept());
                } else {
                    return "y = (" + (y2 - y1) + "/" + (x2 - x1) + ")x + " + Math.abs(yIntercept());
                }
            } else if (yIntercept() == 0) {
                if ((y2 - y1) < 0 && (x2 - x1) < 0) {
                    return "y = (" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + ")x";
                } else if ((x2 - x1) < 0) {
                    return "y = (-" + (y2 - y1) + "/" + Math.abs(x2 - x1) + ")x";
                } else {
                    return "y = (" + (y2 - y1) + "/" + (x2 - x1) + ")x";
                }
            } else {
                if ((y2 - y1) < 0 && (x2 - x1) < 0) {
                    return "y = (" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + ")x + " + Math.abs(yIntercept());
                } else if ((x2 - x1) < 0) {
                    return "y = (-" + (y2 - y1) + "/" + Math.abs(x2 - x1) + ")x + " + Math.abs(yIntercept());
                } else {
                    return "y = (" + (y2 - y1) + "/" + (x2 - x1) + ")x - " + Math.abs(yIntercept());
                }
            }
        }
    }

    //returns a coordinate with an inputted x-value
    public String coordinateForX(double xValue) {
        return "(" + roundedToHundredth(xValue) + ", " + roundedToHundredth(slope() * xValue + yIntercept()) + ")";
    }

    //returns the inputted double rounded to the hundredths place
    public double roundedToHundredth(double toRound) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        String formatted = formatter.format(toRound);
        double formatted2 = Double.parseDouble(formatted.substring(0));
        return formatted2;
    }

    //returns a summary of the information about the two points
    public String lineInfo() {
        String info = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        info += "\nThe equation f the line between these points is: " + equation();
        info += "\nThe slope of this line is: " + slope();
        info += "\nThe y-intercept of the line is: " + yIntercept();
        info += "\nThe distance between the two points is: " + distance();
        return info;
    }

}