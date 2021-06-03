/*
sorted => 0
not sorted and atleast one of min value and max value in 0th and k-1th position => 1
min value at k-1th position and max value in 0th position => 3
all other cases => 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0;i < t ;i++){
            int k = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int max = Integer.MIN_VALUE;
            int max_pos = 0;
            int min = Integer.MAX_VALUE;
            int min_pos = 0;
            boolean sorted_flag = true;
            for(int j = 0;j<k;j++){
                int temp = scan.nextInt();
                if (j!=0 && arr.get(arr.size()-1) > temp) sorted_flag = false;
                if (max < temp){
                    max = temp;
                    max_pos = j;
                }
                if (min > temp){
                    min = temp;
                    min_pos = j;
                }
                arr.add(temp);
            }
//            System.out.println("sorted_flag " + sorted_flag);
//            System.out.println("min pos "  + min_pos);
//            System.out.println("max_pos" + max_pos);
            if (sorted_flag){
                System.out.println(0);
                continue;
            }
            if (min_pos == 0 || max_pos == k-1){
                System.out.println(1);
                continue;
            }
            if (min_pos == k-1 && max_pos == 0){
                System.out.println(3);
                continue;
            }
            //in all other cases print out 2
            System.out.println(2);
        }
    }
}
