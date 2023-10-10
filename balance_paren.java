package recur;
import java.util.*;
public class balance_paren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.next());
        int n=str.length();
        System.out.println(bal(str,n));
    }
    static boolean bal(String str,int n){
        Stack <Character> st=new Stack<Character>();
        for(int i=0;i<n;i++){
            if(open(str.charAt(i))){
                st.push(str.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    if(!matching(st.peek(),str.charAt(i))){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
            }
        }
        return st.isEmpty();
    }

    static boolean open(char c){

        return (c=='{' || c=='[' || c=='(' );
    }
    static boolean matching(char a,char b){
        return (a=='{' && b=='}') || (a=='(' && b==')') || (a=='[' && b==']');
    }
}