
/*
Idea is in every average you can remove all instances of the largest number.
Therefore, the total number of instances minus the frequency of the minimum element
 */


import java.util.ArrayList;
import java.util.Scanner;

public class EshagLovesBigArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0;i < t ;i++){
            int n = scan.nextInt();
            ArrayList A = new ArrayList();
            for(int ti = 0;ti<101;ti++){
                A.add(0);
            }
            int minelem = Integer.MAX_VALUE;
            for (int j = 0;j<n;j++){
                int elem = scan.nextInt();
                if (elem < minelem) minelem = elem;
                A.set(elem, (int)A.get(elem)+1);
            }
            //System.out.println("minelem " + minelem);
            int return_val = n-(int)A.get(minelem);
            System.out.println(return_val);
        }
    }
}
