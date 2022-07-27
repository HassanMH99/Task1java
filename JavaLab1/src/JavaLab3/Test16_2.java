package JavaLab3;

public class Test16_2 {
    public static void main(String[] args){
        int min =1;
        int max=40;
        int index = (int)(Math.random()*(max-min)+(min));
        System.out.println("The Random number is->"+index);

        int arr[]= new int[40];
        int i;
        arr[0]=1;
        arr[1]=1;
        for(i=2;i<40;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        System.out.println("The number in faboni set is->"+arr[index]);

    }
}
