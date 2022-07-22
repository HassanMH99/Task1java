package JavaLab2;

public class Test2 {
    public static void main(String[] args){
        int max=100;
        int min = 0;
        int num = (int) (Math.random() * (max - min)) + min;
        System.out.println("The number is ->"+num);

        if(0<num && num<50){
            System.out.println("Small!");
        }else {
            System.out.println("Big!");
        }
        if(num%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }

}
