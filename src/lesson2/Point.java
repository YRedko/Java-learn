package lesson2;

public class Point {
    final double x, y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static void main(String args[]){
        Point a = new Point(1, 4);
        System.out.println("x = "+a.x+" y = "+a.y);
    }
}
