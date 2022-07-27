package JavaLab3;

public class Test18 {
    public static void main(String[] args){
        String name = "John Bryce";
        char arr[]=name.toCharArray();
        int len = String.valueOf(arr).length();
        //System.out.println(len);
        int count_h=0;

        for(int i=0;i<len;i++){
            if(arr[i]=='h'){
                count_h++;
            }
        }
        System.out.println("The Number of h in name is->"+count_h);
    }
}
