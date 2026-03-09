import java.util.*;

public class Pair_Sum_Brute {

    public static List<Integer> pairSum(ArrayList<Integer> lst , int target){

        ArrayList<Integer> newList = new ArrayList<>(); 

        for(int i = 0 ; i<lst.size() ; i++){

            for(int j = i+1 ; j<lst.size(); j++){

                if(lst.get(i) + lst.get(j) == target){

                    newList.add(i);
                    newList.add(j);
                    
                    return newList;
                }
            }
        }

        return newList;
    }
    
    public static void main(String[] args){
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
