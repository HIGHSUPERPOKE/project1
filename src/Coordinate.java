public class Coordinate {
    private String coordinate1;
    private String coordinate2;
    private int x;
    private int y;
    private int x2;
    private int y2;




    public Coordinate(String coordinate1, String coordinate2){
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public int getA() {
        return x2;
    }


    public int getB() {
        return y2;
    }


    public void parseLogic(){
        int num1 = coordinate1.indexOf(",");
        int num2 = coordinate2.indexOf(",");
        String x1 = coordinate1.substring(1, num1);
        String x2 = coordinate2.substring(1, num2);
        String y1 = coordinate1.substring(num1 + 2, coordinate1.length() - 1);
        String y2 = coordinate2.substring(num2 + 2, coordinate2.length() - 1);
        x = Integer.parseInt(x1);
        y = Integer.parseInt(y1);
        this.x2 = Integer.parseInt(x2);
        this.y2 = Integer.parseInt(y2);
    }


}