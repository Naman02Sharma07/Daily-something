import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        set.add(893);
        set.add(37);
        set.add(30);
        set.add(37);

        if(set.contains(893)){//to chaech whether the elmenet is oreseb=nt inside the hashset or not
            System.out.println("Yes present!");
        }
        if(!set.contains(1)){
            System.out.println("Not contains!");
        }
        System.out.println("Your hasshset is: ");
        System.out.println(set);
        System.out.println(set);//this is used to print the hashset
        System.out.println(set);
        System.out.println("Enter the elements for the hashset: ");
        Iterator it=set.iterator();
        while(it.hasNext()){//it willcheck whether the nest iterator is present or not

            //it's original value if is null or i would say the initial value is always null so to print it we directly pur ..Next

            System.out.println(it.next());//it will print the value of next element
        }
    }
}
