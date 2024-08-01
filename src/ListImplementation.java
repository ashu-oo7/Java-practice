import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListImplementation {
    public static void main(String[] args){
       // arrays();
        stackImpl();
        // vector not used now
        // linkedList also not used but in some case we use.
    }

    public static void arrays(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for(Integer i:list){
            System.out.println(i);
        }
        list.add(1,100);
        System.out.println(list);
        list.remove(1);
        Object arr[] = new Object[list.size()];
        //list.get(index) //to get values
        arr = list.toArray();

        for(Object i:arr)
            System.out.println(i);
    }

    public static void stackImpl(){
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println(st.peek()); // shows top element
        System.out.println(st.pop()); //shows and removes top element
    }
}

