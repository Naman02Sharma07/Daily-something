import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<num;i++){
            int arr[]=new int[3];
            int sum=0;
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            if(sum>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
