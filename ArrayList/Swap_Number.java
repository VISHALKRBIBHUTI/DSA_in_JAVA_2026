import java.util.*;

public class Swap_Number {


    public static void Swap(ArrayList<Integer> lst , int start , int end){

        int temp = lst.get(start);
        lst.set(start , lst.get(end));
        lst.set(end , temp);
        
    }

    public static void Print(ArrayList<Integer> lst){

        for(int i = 0 ; i<lst.size() ; i++){
            System.out.print(lst.get(i) + " ");
        }

        System.out.println();
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(9);
        lst.add(5);
        lst.add(6);

        System.out.println("Before Swap ");
        Print(lst);

        System.out.println();
        Swap(lst, 1, 3);
        Print(lst);
    }
}
