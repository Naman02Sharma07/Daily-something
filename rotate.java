import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=3;

        int start=0;
        int end=arr.length-1;
        System.out.println(Arrays.toString(arr));
        rotate(arr,start,end-n);
        rotate(arr,start,end);
        rotate(arr,start,n-1);
        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int arr[],int start,int end){
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int arr[],int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }
    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
