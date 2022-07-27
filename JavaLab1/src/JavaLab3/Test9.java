package JavaLab3;

public class Test9 {
    public static void main(String[] args){
    int min =0;
    int max=10000;
    int rand = (int)(Math.random()*(max-min)+(min));
        System.out.println("The Random number is->"+rand);
        System.out.println("The Length of Random number is->"+String.valueOf(rand).length());
        // WE can use for loop by using counter with recurstion to know the lentgh

    }

}
