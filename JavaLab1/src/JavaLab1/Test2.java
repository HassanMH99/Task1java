package JavaLab1;

public class Test2 {
    public static void main (String[] args){
        int max = 350;
        int min = 100;
        float hours;
        float minuts;
        int num = (int) (Math.random() * (max - min)) + min;
        System.out.println("The random number is ->"+num);
        hours = ((float) num / 60);
        System.out.println("The Time in Hours is ->"+hours);
        minuts = ((float) num % 60);
        System.out.println("The Time in Minuts is ->"+minuts);

    }
}
