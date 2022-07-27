package JavaLab3;

public class Test12 {
    public static void main(String[] args){
        int min =0;
        int max=10000;
        int len,i;
        int reverse=0;
        int rand = (int)(Math.random()*(max-min)+(min));
        System.out.println("The Random number is->"+rand);
        len = String.valueOf(rand).length();
        for(i=0;i<len;i++){
           reverse = reverse*10+rand%10;
           rand /=10;
        }
        System.out.println("The reverse Number is ->"+reverse);
    }

}
