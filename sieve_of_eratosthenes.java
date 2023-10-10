import java.util.*;
public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=3;
        boolean arr[]=new boolean[num];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<num;i++){
            if(arr[i]==true){
                for(int j=2*i;j<num;j+=i){
                    arr[j]=false;
                }
            }
        }
        int count=0;
        for(int k=0;k<num;k++){
            if(arr[k]!=false){
                count++;
            }
        }
        System.out.println(count);
    }
}
