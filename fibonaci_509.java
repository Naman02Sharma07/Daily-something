import java.util.*;
public class fibonaci_509 {
    public static void main(String[] args) {
        int num=2;

        System.out.println(ans(num));
    }
    static int ans(int num){
        if(num<=1){
            return num;
        }
        return ans(num-1)+ans(num-2);
    }
}
