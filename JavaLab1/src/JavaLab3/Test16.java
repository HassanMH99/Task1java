package JavaLab3;

public class Test16 {
    public static void main(String[] args){
        int arr[]= new int[40];
        int i;
        arr[0]=1;
        arr[1]=1;
        for(i=2;i<40;i++){
            arr[i]=arr[i-1]+arr[i-2];

        }
        for(i=0;i<40;i++){
            System.out.println(arr[i]);
        }
    }
}
