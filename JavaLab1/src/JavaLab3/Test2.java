package JavaLab3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        int i=0;
        int j=10;
        System.out.println("Enter The number to choose loop");
        System.out.println("1->For increment,2->For dec,3->While inc,4->While dec");
        int x =new  Scanner(System.in).nextInt();

        if(x==1){
        for(i=0;i<10;i++) {
            System.out.println("Hello World");
        }

        } else if (x==2) {
            for(i=10;i>0;i--) {
                System.out.println("Hello World");
            }
        }else if(x==3){
            while(i <= 10){
                System.out.println("Hello World");
                i++;
            }


        }else {
            while(j>= 0){
                System.out.println("Hello World");
                j--;
            }
        }
    }
}
