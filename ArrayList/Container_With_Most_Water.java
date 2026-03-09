import java.util.*;

public class Container_With_Most_Water {

    public static int maxWater(ArrayList<Integer> height ){

        int maxWater = Integer.MIN_VALUE;

        for(int i = 0 ; i<height.size(); i++){

            for(int j = i + 1; j<height.size() ; j++){

                int hgt = Math.min(height.get(i) , height.get(j));
                int wdth = j - i;
                int CurrWater = hgt * wdth;

                maxWater = Math.max(CurrWater, maxWater);
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

        System.out.println("Max Area That a Container Store is : "+ maxWater(height));
    }
}
