import java.util.*;

public class Max_Element {

    public static int maxElement(ArrayList<Integer> lst){

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< lst.size() ; i++){

            if(max<lst.get(i)){
                max = lst.get(i);
            }
        }

        return max;
    }
    

    public static void main(String[] args) {
       
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(5);
        lst.add(9);
        lst.add(3);
        lst.add(6);

        System.out.println("Max Element in ArrayList is : "+ maxElement(lst));
    }
}
