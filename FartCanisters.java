
import java.util.*;

public class FartCanisters {
    public static void main(String[] args){
        System.out.println("Allahu Akbar");

        int[] nums;
        nums = new int[5];
        System.out.println(nums.length);
        //
        nums[0] = 3;
        System.out.println(nums[0]);
        System.out.println(nums[2]);
        System.out.println(nums[4]);
        System.out.println(nums[1]);
        String[] names = new String[3];
        System.out.println(names[0]);
        names[2] = "sean";
        System.out.println(names[2]);

        double[] points = {2, 5.1, 3, 8, 12};
        System.out.println(points.length);
        System.out.println(points[1]);
        points[3] = 0;
        System.out.println(points[3]);
        System.out.println(points[points.length-1]);
        points[points.length-1] = points[points.length-1]*2;
        System.out.println(points[points.length-1]);
        System.out.println(names[names.length-1]);
      



    }
}