import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(2);
        lst.add(5);
        lst.add(9);
        lst.add(3);
        lst.add(6);
        System.out.println("Before Sorting");
        System.out.println(lst);


        System.out.println("After Sorting");
        Collections.sort(lst);
        System.out.println(lst);


        // Descending Order
        System.out.println("Descending Sorting");
        Collections.sort(lst , Collections.reverseOrder());
        System.out.println(lst);
    }
}
