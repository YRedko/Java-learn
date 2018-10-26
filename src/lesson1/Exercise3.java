package lesson1;

public class Exercise3 {
    public static void sumNum(int num){
        int a, b, c;
        a=num%10;
        b=num%100/10;
        c=num/100;
        num=a+b+c;
        System.out.println(num);
    }
    public static void main(String[] args){
        sumNum(725);
    }
}
