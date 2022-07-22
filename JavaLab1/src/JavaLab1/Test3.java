package JavaLab1;

import java.util.Random;

public class Test3 {
    public static void main(String[] args){
        int num1 = (int)(Math.random()*101);
        int num2 = (int)(Math.random()*101);
        System.out.println("The First Number is ->"+num1);
        System.out.println("The Second Number is ->"+num2);
        System.out.println("The Bigger Vales is ->"+(Math.max(num1,num2)));
    }
}
