import java.util.HashMap;
import java.util.*;
public class Hash_Map  {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        //just like the hashset hashmap are also unordered
        map.put("Naman",89);
        map.put("aditya",9);
        map.put("raj",9);
        map.put("ahs",20);
        map.put("yum",203);
        System.out.println(map);
        map.put("ramesh",78);//this is used to put elements inside the hashmaps
        map.put("Naman",883);
        System.out.println(map);//this is the way by which we print the hashmap

        System.out.println("Check whether the key is present in the hashmap or not: ");
        if(map.containsKey("Naman")){
            System.out.println("Yes key is present");
        }
        else{
            System.out.println("No key is present");
        }
        if(map.containsValue(20)){
            System.out.println("Yes value is present");
        }
        else{
            System.out.println("No value present");
        }
        System.out.println(map.get("Naman"));
        System.out.println(map.get("Abhi"));

        System.out.println("The new method to iterate a value: ");
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e);
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getValue());
        }
        map.remove("Naman");
        System.out.println(map);
    }
}
