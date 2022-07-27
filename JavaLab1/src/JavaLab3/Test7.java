package JavaLab3;

public class Test7 {
    public static void main(String[] args){
        int min = 1;
        int max=7;
        int i,fac=1;

        int rand = (int) (Math.random() * (max - min)) + min;
        System.out.println("The Random Number is->"+rand);
        System.out.println("The numbers is ->");
        for(i=1;i<=rand;i++){
            System.out.println(i);
        }
        for(i=rand;i>0;i--){
        fac = fac*i;
        }
        System.out.println("The Result of Factorial is ->"+fac);

    }
}
