import java.util.*;
import java.lang.Integer;
import java.util.Set;
public class majority_element169 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,1};
        major(arr);
    }
    static void major(int arr[]){
        int max=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
