import java.util.*;

public class ArrayList_size {

    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        System.out.println(lst);
        System.out.println(lst.size());


        // iterating Over ArrayList
        for(int i = 0 ; i<lst.size(); i++){
            System.out.print(lst.get(i) + " ");
        }
        System.out.println();
    }
}
