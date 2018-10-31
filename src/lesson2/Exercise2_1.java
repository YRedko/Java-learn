package lesson2;

public class Exercise2_1 {
    public static int calculateFibonacci(int x){
        if(x==1 || x==2){
            return 1;
        }else if(x==0){
            return 0;
        } else{
            return calculateFibonacci(x-1)+calculateFibonacci(x-2);
        }
    }
    public static void main(String args[]){
        System.out.println(calculateFibonacci(4));
    }
}
