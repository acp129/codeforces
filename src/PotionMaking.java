
//this have something to do with gcd?
//i.e we are trying to find the simplest fraction k/100 (say k = 2, then 1/50, meaning we need 50 steps).
//simplest logic: return 100/k if that is an integer else return 100;
//and the above fails with say the test case 3/5, to which the answer should be 5.
//basically you find the gcp of 100 and k and we're good.
//need to learn euclid's algo.  

import java.util.Scanner;

public class PotionMaking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0;i < t ;i++){
            int k = scan.nextInt();
            double me = 1;
            double w = 0;
            int steps = 1;
            double ratio = (me*100)/(me+w);
            while(ratio!=k){
                steps++;
                if (ratio < k){
                    me++;
                    ratio = (me*100)/(me+w);
                }
                else{
                    w++;
                    ratio = (me*100)/(me+w);
                }
            }
            System.out.println(steps);
        }
    }
}
