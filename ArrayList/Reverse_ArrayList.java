import java.util.*;

public class Reverse_ArrayList {


    // Swapping
    public static void Swap(ArrayList<Integer> lst, int start , int end){

        int temp = lst.get(start);
        lst.set(start , lst.get(end));
        lst.set(end , temp);

    }

    // Reverse
    public static void Reverse(ArrayList<Integer> lst , int start , int end){

        while(start<end){
            Swap( lst, start, end);
            start++;
            end--;
        }
    }


    // Print
    public static void Print(ArrayList<Integer> lst){

        for(int i = 0 ; i<lst.size() ; i++){
            System.out.print(lst.get(i) + " ");
        }

        System.out.println();
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        System.out.println("Before Reverse");
        Print(lst);

        System.out.println();

        // Reversing
        Reverse(lst, 0, lst.size()-1);
        System.out.println("After Reverse");
        Print(lst);


    }
}
