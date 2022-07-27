package JavaLab3;

public class Test4 {
    public static void main(String[] args){
        int min=0;
        int med=50;
        int max = 100;
        int i;
        int num1 = (int) (Math.random() * (med - min)) + min;
        int num2 = (int) (Math.random() * (max - med)) + med;
        System.out.println("The first Number->"+num1);
        System.out.println("The Second Number->"+num2);
        System.out.println("The numbers between Two Numbers");
        for(i=(num1+1);i<num2;i++){
            System.out.println(i);

        }

    }
}
