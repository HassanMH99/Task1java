package JavaLab3;

import java.util.Scanner;

public class Boom {
    public static void main(String[] args){
        System.out.println("Enter the Number To play the game");
    int num = new Scanner(System.in).nextInt();
    int firstdigit=num%10;
    int lastdigit=num/10;
        //System.out.println(firstdigit);
        //System.out.println(lastdigit);
    if(num%7==0){
        System.out.println("Boom");

    } else if (firstdigit==7 || lastdigit==7) {
        System.out.println("Boom");
    }else {
        System.out.println("The number is"+num);
    }


    }
}
