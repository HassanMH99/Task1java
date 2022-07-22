package JavaLab2;

public class Test1 {
    public static void main(String[] args){
        int max=100;
        int min = 0;
        int num = (int) (Math.random() * (max - min)) + min;
        System.out.println("The number is ->"+num);
        if(num>50 ) {
            System.out.println("Big!");

            } else if (num<50){
            System.out.println("Small!");
        }else {
            System.out.println("Bingo!");
        }
    }
        }



