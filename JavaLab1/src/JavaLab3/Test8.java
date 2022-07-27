package JavaLab3;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args){
        System.out.println("Enter the Number To Check Factorial");
        int num = new Scanner(System.in).nextInt();
        int n=1;
        int fact=1;
        System.out.println("1->For increment,2->For dec,3->While inc,4->While dec");
        int check = new Scanner(System.in).nextInt();
        if(check == 1){
            for(n=1;n<=num;n++){
                fact = n*fact;

            }
            System.out.println("The factorial is->"+fact);
            System.out.println("This For Loop Increment");
        }else if(check == 2){
            for(n=num;n>=1;n--){
                fact = n*fact;

            }
            System.out.println("The factorial is->"+fact);
            System.out.println("This For Loop Decrement");
        }else if(check == 3){
            while(n<=num){
                fact = n*fact;
                n++;
            }

            System.out.println("The factorial is->"+fact);
            System.out.println("This While Loop Increment");
        }else if(check == 4){
            while(num>=1){
                fact = num*fact;
                num--;
            }

            System.out.println("The factorial is->"+fact);
            System.out.println("This While Loop Decrement");
        }else {
            System.out.println("Choose The Correct check to choose the loop");
        }


    }
}
