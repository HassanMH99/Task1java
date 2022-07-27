package JavaLab3;

public class Test10 {
    public static void main(String[] args){
        int min =0;
        int max=10000;
        int lastdgit;
        int rand = (int)(Math.random()*(max-min)+(min));
        System.out.println("The Random number is->"+rand);
        lastdgit = rand%10;
        System.out.println("The last digit is ->"+lastdgit);
    }
}
