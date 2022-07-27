package JavaLab3;

public class Test6 {
    public static void main(String[] args ){
        int min=0;
        int med=10;
        int med1=50;
        int max = 100;
        int i;
        int num1 = (int) (Math.random() * (med - min)) + min;
        int num2 = (int) (Math.random() * (max - med1)) + med1;
        System.out.println("The First Number is->"+num1);
        System.out.println("The Second Number is->"+num2);
        for(i=0;i<=num2;i++){
            if(i%num1 ==0){
                System.out.println(i);
            }
        }

    }
}
