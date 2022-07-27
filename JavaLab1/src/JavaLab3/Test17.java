package JavaLab3;

public class Test17 {
    public static void main(String[] args){
        char arr[] = {'a','b','c','a','b','d','r','c'};

        int len = String.valueOf(arr).length();
        //System.out.println(len);
        int count_a=0;
        int count_ac=0;
        for(int i=0;i<len;i++){
            if(arr[i]=='a'){
                count_a++;
            }
            if(arr[i]=='a' || arr[i]=='c'){
                count_ac++;
            }

        }
        System.out.println("The number of a Char is->"+count_a);
        System.out.println("The number of a+c Char is->"+count_ac);
    }
}
