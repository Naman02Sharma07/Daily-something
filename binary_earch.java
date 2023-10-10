package recur;
import java.util.*;
public class binary_earch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={34,2,4,1,22,442,12,434};
        int start=0;
        int end=arr.length-1;
        int target=sc.nextInt();
        System.out.println(binary(arr,start,end,target));
    }
    static int binary(int arr[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return 1;
        }
        else if(arr[mid]>target){
            return binary(arr,start,mid-1,target);
        }
        else if(arr[mid]<target){
            return binary(arr,mid+1,end,target);
        }
        return 0;
    }
}
