package JavaLab3;

public class Test11 {
    public static void main(String[] args){
        int min =0;
        int max=10000;
        int len,i;
        int firstdigit=0;
        int rand = (int)(Math.random()*(max-min)+(min));
        System.out.println("The Random number is->"+rand);

        firstdigit = rand%100;
        while(rand!=0){
           firstdigit = rand%10;
           rand /=10;

        }
        System.out.println("The FirstDigit is ->"+firstdigit);
    }

}
