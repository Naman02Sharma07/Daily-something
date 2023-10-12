import java.util.*;
public class alternate_sum2544 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=Integer.toString(num);
        int arr[]=new int[str.length()];
        int i=0;
        while(num!=0){
            int rem=num%10;
            arr[i]=rem;
            num=num/10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
