import java.util.*;

public class Matrix_Table_ArrayList {
    
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> mainlst = new ArrayList<>();

        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<Integer> lst3 = new ArrayList<>();

        for(int i = 1; i<=5; i++){
            lst1.add(i);
            lst2.add(2*i);
            lst3.add(3*i);
        }

        mainlst.add(lst1);
        mainlst.add(lst2);
        mainlst.add(lst3);

        for(int i = 0 ; i<mainlst.size(); i++){

            for(int j = 0 ; j<mainlst.get(i).size(); j++){

                System.out.print(mainlst.get(i).get(j)+" ");
            }

            System.out.println();
        }

        System.out.println(mainlst);
    }
}
