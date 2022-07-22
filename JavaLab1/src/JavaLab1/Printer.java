package JavaLab1;

import java.util.Scanner;
import java.util.*;
public class Printer {


    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("There will be");
        int n = s.nextInt();

        int vistors[] = new int[n];
        for(i =0 ;i<n;i++){
            System.out.println("Enter the Initail Value of Vistor ->"+(i+1));
          vistors[i] = s.nextInt();

        }

        System.out.println("Vistors is "+n);
        System.out.println("People For Dinner");
        System.out.println("There will be "+n+" people for dinner");


    }

}
