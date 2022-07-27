package JavaLab3;

public class Test5 {
    public static void main(String[] args ){
        int rand = (int)(Math.random()*50);
        System.out.println("The Random Number is ->"+rand);
        int i;
        for(i=0;i<rand;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
