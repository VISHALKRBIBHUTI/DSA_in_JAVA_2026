import java.util.*;

public class Container_Two_Pointer_Most_Water {

    public static int maxWater(ArrayList<Integer> height){

        int left = 0;
        int right = height.size()-1;
        int maxWater = Integer.MIN_VALUE;

        while(right> left){

            int ht = Math.min(height.get(left) , height.get(right));
            int wdth = right - left;
            int currWater = ht * wdth;
            maxWater = Math.max(currWater, maxWater);
            
            if(height.get(left)<height.get(right)){
                left++;
            }
            else{
                right--;
            }
        }

        return maxWater;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Max Water that a Container of Area : "+ maxWater(height));
    }
}
