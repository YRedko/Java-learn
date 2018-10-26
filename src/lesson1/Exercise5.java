package lesson1;

public class Exercise5 {
    public static void highestDigit(int num){
        int a, b, c;
        a=num%10;
        b=num%100/10;
        c=num/100;
        if(a>b && a>c){
            System.out.println("Highest digit: "+a);
        }
        if(b>a && b>c){
            System.out.println("Highest digit: "+b);
        }
        if(c>a && c>b){
            System.out.println("Highest digit: "+c);
        }
        if(a==b){
            System.out.println(a+" = "+b);
        }
        if(a==c){
            System.out.println(a+" = "+c);
        }
        if(b==c){
            System.out.println(b+" = "+c);
        }
    }
    public static void main(String[] args){
        highestDigit(725);
    }
}
