package JavaLab3;

public class Test13 {
    public static void main(String[] args){
        int min =0;
        int max=10000;
        int len,i;
        int firstdigit=0;
        int sum=0;
        int reverse=0;
        int rand = (int)(Math.random()*(max-min)+(min));
        int rand1=rand,rand2=rand;
        System.out.println("The Random number is->"+rand);
        System.out.println("The number of Digit is->"+String.valueOf(rand).length());
       len= String.valueOf(rand).length();
        firstdigit = rand%100;
        while(rand!=0){
            firstdigit = rand%10;
            rand /=10;
        }
        System.out.println("The FirstDigit is ->"+firstdigit);
        while (rand1!=0){
            sum = sum+rand1%10;
            rand1 = rand1 / 10;
        }
        System.out.println("The Sum Number is ->"+sum);
        for(i=0;i<len;i++){
            reverse = reverse*10+rand2%10;
            rand2 /=10;
        }
        System.out.println("The reverse Number is ->"+reverse);
    }
}
