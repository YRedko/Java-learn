package lesson2;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static double perimeter(Triangle tr){
        double ab, bc, ac, P; // стороны и периметр
        ab = Math.sqrt((Math.pow(tr.b.x - tr.a.x,2))+(Math.pow(tr.b.y - tr.a.y,2)));
        bc = Math.sqrt((Math.pow(tr.c.x - tr.b.x,2))+(Math.pow(tr.c.y - tr.b.y,2)));
        ac = Math.sqrt((Math.pow(tr.c.x - tr.a.x,2))+(Math.pow(tr.c.y - tr.a.y,2)));
        P = ab + bc + ac;
        return P;
    }
    public static double square(Triangle tr){
        double S;
        S = 0.5*((tr.a.x - tr.c.x)*(tr.b.y - tr.c.y)-(tr.a.y - tr.c.y)*(tr.b.x - tr.c.x));
        return S;
    }
    public static Point lowerLeftVertex(Triangle tr){
        Point z;
        if(tr.a.x < tr.b.x){
            if(tr.a.x < tr.c.x){
                return tr.a;
            } else if(tr.a.x == tr.c.x){
                if(tr.a.y < tr.c.y){
                    return tr.a;
                }
                return  tr.c;
            } else{
                return tr.c;
            }
        }else if(tr.a.x == tr.b.x){
            if(tr.a.y < tr.b.y){
                return tr.a;
            } else{
                return tr.b;
            }
        } else if
    }
    public static void move(Triangle tr, Point z){

    }
    public static void main(String args[]){
        Point a = new Point(2, 4);
        Point b = new Point(4, 1);
        Point c = new Point(4, 3);
        Triangle tr = new Triangle(a, b, c);
        System.out.println(perimeter(tr));
        System.out.println(square(tr));
    }
}
