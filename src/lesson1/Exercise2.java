package lesson1;

public class Exercise2 {
    public static void uravnenie(double a, double b, double c){
        double D;
        D=b*b-4*a*c;
        if(D>0){
            double x1=(-b-Math.sqrt(D))/(2*a);
            double x2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        } else if (D==0){
            double x1=(-b-Math.sqrt(D))/(2*a);
        } else if (D<0){
            System.out.println("Korney net");
        }
    }
    public static void main(String args[]){
        uravnenie(5,3,-2);
    }
}
