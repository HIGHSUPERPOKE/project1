public class LinearEquation {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private double slope;




    public LinearEquation(int x1, int y1, int x2, int y2){
        num1 = x1;
        num2 = x2;
        num3 = y1;
        num4 = y2;
    }




    public double distance(){
        return roundedToHundredth((Math.sqrt((Math.pow(num2 - num1, 2) + Math.pow(num4 - num3, 2)))));
    }




    public double yIntercept(){
        return num3 - (slope() * num1);
    }




    public double slope(){
        return roundedToHundredth((double) (num4 - num3) / (num2 - num1));
    }




    public String equation() {
        String slope = null;
        slope = (num4 - num3) + "/" + (num2 - num1);
        if (num4 - num3 == 0) {
            return "y = " + yIntercept();
        } else {
            if ((num4 - num3) < 0 && (num2 - num1) < 0) {
                slope = Math.abs(num4 - num3) + "/" + Math.abs(num2 - num1);
            } else if ((num4 - num3) < 0) {
                slope = "-" + Math.abs(num4 - num3) + "/" + Math.abs(num2 - num1);
            } else if ((num2 - num1) < 0) {
                slope = "-" + (num4 - num3) + "/" + Math.abs(num2 - num1);
            }
            if ((num4 - num3) % (num2 - num1) == 0) {
                slope = String.valueOf((num4 - num3) / (num2 - num1));
            }
            if (Math.abs(num4 - num3) - Math.abs(num2 - num1) == 0) {
                if (slope() < 0) {
                    slope = "-";
                } else {
                    slope = "";
                }
            }
            if (yIntercept() == 0) {
                return "y = " + slope + "x";
            } else if (yIntercept() < 0) {
                return "y = " + slope + "x" + " - " + Math.abs(yIntercept());
            } else {
                return "y = " + slope + "x" + " + " + yIntercept();
            }
        }
    }
    public String coordinateForX(double x){
        return "(" + x + ", " + ((slope() * x) + yIntercept()) + ")";
    }

    public double roundedToHundredth(double toRound){
        return Math.round(toRound * 100) / 100.0;
    }

    public String lineInfo(){
        return "The two points are: (" + num1 + ", " + num3 + ") and (" + num2 + ", " + num4 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The y-intercept of the line is: " + yIntercept() + "\n" + "The slope of this line is: " + slope() + "\n" + "The distance between the two points is: " + distance();
    }
}
