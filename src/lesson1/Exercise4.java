package lesson1;

public class Exercise4 {
    public static void nearestTo10(double m, double n){
        if(m==n){
            System.out.println(m+" = "+n);
        } else if(Math.abs(10-m)<Math.abs(10-n)){
            System.out.println(m+" nearest to 0 than "+n);
        } else if(Math.abs(10-m)>Math.abs(10-n)){
            System.out.println(n+" nearest to 0 than "+m);
        }
    }
    public static void main(String[] args){
        nearestTo10(8.05,11.25);
    }
}
