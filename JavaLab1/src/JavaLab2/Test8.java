package JavaLab2;

public class Test8 {
    public static void main(String args[]){
        int max=2022;
        int min = 0;
        int year = (int) (Math.random() * (max - min)) + min;
       System.out.println("The Yaer is ->"+year);
       if(year%4 ==0 && year%100 != 100){
           System.out.println("Its Leap Year");
       } else if (year%400 == 0) {
           System.out.println("Its Leap Year");
       }else {
           System.out.println("Its Not Leap Year");
       }

    }
}
