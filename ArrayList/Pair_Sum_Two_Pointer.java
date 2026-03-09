import java.util.*;
public class Pair_Sum_Two_Pointer {

    public static List<Integer> pairSum(ArrayList<Integer>lst , int target){

        ArrayList<Integer> newList = new ArrayList<>();
        
        int Lp = 0;
        int Rp = lst.size()-1;

        while(Lp<Rp){

            if(lst.get(Lp) + lst.get(Rp) == target){
                newList.add(Lp);
                newList.add(Rp);

                return newList;
            }
            else if(lst.get(Lp) + lst.get(Rp) < target){
                Lp++;
            }
            else{
                Rp--;
            }
        }

        return newList;
    }
   public static void main(String[] args) {

    ArrayList<Integer> lst = new ArrayList<>();
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(4);
    lst.add(5);
    lst.add(6);


    System.out.println(pairSum(lst, 5));
    
   } 
}
