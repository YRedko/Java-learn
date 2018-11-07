package lesson3;

public class Exercise3p3{
    public static void main(String []args){
        int count = 0;
        int hours =0;
        int minutes =0;
        while(hours < 24){
            //System.out.println("h "+hours);
            while(minutes < 60){
                //System.out.println("m "+minutes);
                //System.out.println(hours+":"+minutes);
                if(hours%10 == minutes/10%10 && hours/10%10 == minutes%10){
                    count++;
                    System.out.println(count+": "+hours+":"+minutes);
                }
                minutes++;
            }
            minutes = 0;
            hours++;
        }
        System.out.println("count: "+count);
    }}
