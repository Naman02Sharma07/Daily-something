import java.util.*;
public class missing_1 {
    public static void main(String[] args) {
        int arr[]={1,5,2,4};
        int ans=missing(arr);
        System.out.println(ans);
    }
    static int missing(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=correct){
                swap(arr,i,correct);
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length;
    }
    static void swap(int arr[],int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
}
