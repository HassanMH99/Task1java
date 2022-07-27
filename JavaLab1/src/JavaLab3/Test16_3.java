package JavaLab3;

public class Test16_3 {
    public static void main(String[] args){
        int min =10;
        int max=50;
        int index = (int)(Math.random()*(max-min)+(min));
        System.out.println("The Random number is->"+index);
        int arr[]= new int[index];
        int i;
        arr[0]=1;
        arr[1]=1;
        for(i=2;i<index;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        for(i=0;i<index;i++){
            System.out.println(arr[i]);
        }

    }
}
