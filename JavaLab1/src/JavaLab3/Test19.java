package JavaLab3;

public class Test19 {
    public static void main(String[] args){
       String str = "Sara Shara Shir Cameach";
       char arr[] = str.toCharArray();
       int len =String.valueOf(arr).length();
       int count=0;
       for(int i=0;i<len;i++){
           if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ){
           count++;
           }

       }
        System.out.println("The number of Vowel in string is->"+count);
    }
}
