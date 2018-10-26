package lesson1;

public class Exercise1 {
    static double salary(double salaryForHour, double time){
        double money;
        if(time >= 60){
            money=40*salaryForHour+30*salaryForHour;
            return money;
        } else if(time > 40 && time < 60){
            money=(40+(time-40)*1.5)*salaryForHour;
            return money;
        } else {
            money=time*salaryForHour;
            return money;
        }
    }
    public static void main(String args[]){
        System.out.println(salary(5,50));
    }
}
