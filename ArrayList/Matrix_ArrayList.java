import java.util.*;

public class Matrix_ArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainlst = new ArrayList<>();

        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1); lst1.add(2);
        mainlst.add(lst1);

        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(3); lst2.add(4);
        mainlst.add(lst2);

        // To Print the Value Need Nested Loop
        for(int i = 0 ; i<mainlst.size() ; i++){

            for(int j = 0 ; j<mainlst.get(i).size(); j++){

                System.out.print(mainlst.get(i).get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainlst);

    }
}
