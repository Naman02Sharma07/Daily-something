import java.util.*;
public class parity_array905 {
    public static void main(String[] args) {
//        int arr[]={3,1,2,4};
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//            if(arr[i]%2 > arr[j]%2){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//            if(arr[i]%2==0) i++;
//            if(arr[j]%2==0 )j--;
//        }
//        int arr[]={1,2,3,4};
//        ArrayList<Integer> A1=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                A1.add(arr[i]);
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2!=0){
//                A1.add(arr[i]);
//            }
//        }
//        for(int i=0;i<A1.size();i++){
//            arr[i]=A1.get(i);
//        }
//        System.out.println(Arrays.toString(arr));
        int arr[]={3,1,2,4};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(arr[i]%2!=0 && arr[j]%2!=0){
                j--;
            }
            else if(arr[i]%2==0 && arr[j]%2==0){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
