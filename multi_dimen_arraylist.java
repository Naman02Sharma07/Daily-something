import java.util.*;
public class multi_dimen_arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <ArrayList<Integer>> A1=new ArrayList<>();
        for(int k=0;k<3;k++){
            A1.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A1.get(i).add(sc.nextInt());
            }
        }
        System.out.println(A1);
    }
}
