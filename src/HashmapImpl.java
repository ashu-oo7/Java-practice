import java.util.HashMap;
import java.util.Set;
public class HashmapImpl {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",201);
        hm.put("China",215);
        hm.put("USA",100); // if value already present then rewrites it
        hm.put("UK",70);

        System.out.println(hm);
        int val = hm.get("India");
        System.out.println("India : "+val); // gives null if does contain the value

        boolean state = hm.containsKey("India");
        Set<String> keys = hm.keySet();

        for(String s :hm.keySet())
            System.out.println(hm.get(s));
    }
}
