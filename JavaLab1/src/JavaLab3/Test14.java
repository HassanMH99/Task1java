package JavaLab3;

public class Test14 {
    public static void main(String[] args){
        int min =0;
        int max=100000;
        int reverse=0;
        int rand = (int)(Math.random()*(max-min)+(min));
        System.out.println("The Random number is->"+rand);
        int temp=rand;
        while(temp!=0){
            int pal = temp%10;
            reverse = reverse*10+pal;
            temp/=10;

        }
        if(reverse==rand){
            System.out.println("The number is Palindrom");

        }
        else {
            System.out.println("The number is Not Palindrom");
        }
    }
}
