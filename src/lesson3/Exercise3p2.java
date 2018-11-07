package lesson3;

public class Exercise3p2{

    public static void main(String []args){
        int i = 0;
        int count = 0;
        int first;
        int second;
        int third;
        int fourth;
        int fifth;
        int sixth;
        while(i<=999999){
            first = i%10;
            second = i%100/10;
            third = i%1000/100;
            fourth = i%10000/1000;
            fifth = i%100000/10000;
            sixth = i%1000000/100000;
            if(first+second+third == fourth+fifth+sixth){
                count++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("count: "+count);
    }
}
