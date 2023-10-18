import java.util.*;
public class Bear_Brother {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w1=sc.nextInt();
        int a=1,b=1;
        int count=0;
        int w2=sc.nextInt();
        for(int i=1;i<=10;i++){
            a=w1*3;
            b=w2*2;
//            System.out.println("the weight of 1: "+a);
//            System.out.println("the weight of 2: "+b);
            //b=a*3;
            if(a>b){
                count=i;
                break;
            }
            w2=b;
            w1=a;
        }
        System.out.println(count);
    }
}
