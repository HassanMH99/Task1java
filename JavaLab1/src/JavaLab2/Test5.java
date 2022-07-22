package JavaLab2;

public class Test5 {
    public static void main(String args[]){
        int a = (int)(Math.random()*101);
        int b = (int)(Math.random()*101);
        int c = (int)(Math.random()*101);
        int minnumb;
        minnumb = Math.min(a,b);
        minnumb = Math.min(minnumb,c);
        System.out.println("The first Number is -> "+a);
        System.out.println("The second Number is -> "+b);
        System.out.println("The third Number is -> "+c);
        System.out.println("The Minimum Number is -> "+minnumb);


    }
}
