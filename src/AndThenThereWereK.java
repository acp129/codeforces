/*
Given t test cases, where in each test case we are given n, we need to find the highest value
of k where n & (n-1) & (n-2) ... k = 0
Long story short, if n has m bits in its binary representation, the answer is 2^(m-1)-1
*/

import java.util.Scanner;

public class AndThenThereWereK {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0;i < t ;i++){
            int n = scan.nextInt();
            int temp = n;
            int num = 0;
            while(temp!=0){
                temp = temp/2;
                num = num*2+1;
            }
            System.out.println(num/2);
        }
    }
}
