package JavaLab1;

public class Test {
    public static void main(String[] args){
        int a = (int)(Math.random()*101);
        int b = (int)(Math.random()*101);
        System.out.println("The First Number is ->"+a);
        System.out.println("The Second Number is ->"+b);
        System.out.println("The Sum of Two Numbers is ->"+(a+b));
        System.out.println("The Average of Two Number is ->"+(a+b/2));
        System.out.println("The Reminder When divide The first Number is ->"+(a%10));
        System.out.println("The Reminder When divide The Second Number is ->"+(b%10));
        System.out.println("The Area of Rectangle is ->"+(a*b));
    }
}
