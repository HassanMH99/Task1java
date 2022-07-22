package JavaLab2;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args){
        System.out.println("Enter the Salary You want to Check");
        double tax=0;
        double salary = new Scanner(System.in).nextDouble();
        if(0<salary && salary<23000){

            tax = salary *0.1;
            System.out.println("The Salary before Tax is ->"+salary);
            System.out.println("The Tax is ->"+tax);
            System.out.println("The Salary after Tax is ->"+(salary-tax));


        } else if (23000<salary && salary<50000) {
            tax = salary *0.2;
            System.out.println("The Salary before Tax is ->"+salary);
            System.out.println("The Tax is ->"+tax);
            System.out.println("The Salary after Tax is ->"+(salary-tax));

        }else if (50000<salary && salary<100000) {

            tax = salary *0.3;
            System.out.println("The Salary before Tax is ->"+salary);
            System.out.println("The Tax is ->"+tax);
            System.out.println("The Salary after Tax is ->"+(salary-tax));
        }else if (100000<salary) {
            tax = salary *0.4;
            System.out.println("The Salary before Tax is ->"+salary);
            System.out.println("The Tax is ->"+tax);
            System.out.println("The Salary after Tax is ->"+(salary-tax));
        }


    }
}
