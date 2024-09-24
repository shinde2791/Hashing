import java.util.HashMap;
import java.util.Map;


public class hashmap {
    public static void main(String[] args) {
        HashMap <Integer,String>ht=new HashMap<>();
        ht.put(1,"jayesh");
        ht.put(2,"prashant");
        ht.put(3,"tejas");
        ht.put(4,"vishal");
        ht.put(5,"sid");



        String name1 = ht.get(1);
        System.out.println(name1);

        // System.out.println(ht);
        // System.out.println(ht.get("jayesh"));
        // System.out.println(ht.remove(5));
        // System.out.println(ht);
        // System.out.println(ht.containsKey(3));
        // System.out.println(ht.containsValue("jayesh"));
        // System.out.println(ht.keySet());
        // System.out.println(ht.values()); 

        // int arr[]={2,12,44,122,98,88};

        // for(int i : arr){
        //   System.out.println(i);
        // }

        for(Map.Entry<Integer,String> hm:ht.entrySet()){
          System.out.println("all the key "+ hm.getKey());
          System.out.println("all the key "+ hm.getValue());
        }

    }
    
}
