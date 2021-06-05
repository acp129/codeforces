
//this have something to do with gcd?
//i.e we are trying to find the simplest fraction k/100 (say k = 2, then 1/50, meaning we need 50 steps).
//simplest logic: return 100/k if that is an integer else return 100;
//and the above fails with say the test case 3/5, to which the answer should be 5.
//basically you find the gcp of 100 and k and we're good.
//need to learn euclid's algo.  

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SifidAndStrangeSequences {

    static int find_max_of_lesser_elem(int i, int j, ArrayList<Integer> A, int elem){
//        System.out.printf("%d %d\n",i, j);
        if (j == i+1){
            if (A.get(j) <= elem){
                return j;
            }
            else{
                if (A.get(i) <= elem){
                    return i;
                }
                else{
                    return -1;
                }
            }
        }
        else{
            int ind = (i+j)/2;
            int val = A.get(ind);
            if (val > elem){
                return find_max_of_lesser_elem(i, ind, A, elem);
            }
            if (val <=elem){
                return find_max_of_lesser_elem(ind, j, A, elem);
            }
            //this line should never execute
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0;i < t ;i++){
            int n = scan.nextInt();
            boolean neg = true;
            int negcount = 0;
            ArrayList<Integer> A = new ArrayList<>();
            for (int j = 0;j<n;j++){
                int temp = scan.nextInt();
                if (temp > 0) neg = false;
                else negcount++;
                A.add(temp);
            }
            if (neg){
                System.out.println(n);
                continue;
            }
            int val = negcount;
            Collections.sort(A);
            if (A.get(0) > 0) {
                System.out.println(0);
                continue;
            }
            //reach here with both +ve and negative numbers
            for(int j = n-1;j > -1;j--){
                int count = 1;
                if (A.get(j) <=0){
                    break;
                }
                int maxx = A.get(j);
                int elem = 0;
                while(true){
//                    System.out.println("loopin");
//                    System.out.println(A.get(j));
                    int loc = find_max_of_lesser_elem(0,j,A,elem);
                    if (loc > 0){
                        elem = A.get(loc) - maxx;
                        count++;
                    }
                    else{
                        if (count > negcount) negcount = count;
                        break;
                    }
                }
            }
            System.out.println(val);
        }
    }
}
