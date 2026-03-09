import java.util.*;

public class Operation_ArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<>();

        // 1. Add(element) Element 
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        System.out.println(lst);

        // 2. get(index) Element 
        // int elmnt = lst.get(2); // 3
        // System.out.println(elmnt);


        // 3. remove(index) Element
        // int remove_ele = lst.remove(2);
        // System.out.println(remove_ele);
        // System.out.println(lst);


        // 4. set(index , element)
        // lst.set(2, 10);
        // System.out.println(lst);


        // 5. contains(element)
        // System.out.println(lst.contains(3));
        // System.out.println(lst.contains(12));


        // 6. add(index , element)
        lst.add(1 , 15);
        System.out.println(lst);

        



    }
}
