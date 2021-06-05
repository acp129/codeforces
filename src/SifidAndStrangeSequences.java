
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SifidAndStrangeSequences {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0;i < t ;i++) {
            int n = scan.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                A.add(scan.nextInt());
            }
            Collections.sort(A);
            int count = 1;
            int maxx = Integer.MAX_VALUE;
            for(int j = 1;j< n ;j++){
                int cur = A.get(j);
                int prev = A.get(j-1);
                maxx = Integer.min(maxx, cur-prev);
                if (cur > maxx) break;
                count++;
            }
            System.out.println(count);
        }
    }
}
