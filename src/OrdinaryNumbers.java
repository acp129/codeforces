/*
A +ve number is ordinary if all digits in its base 10 representation are the same.
eg. 1, 2, 3, 77, 99, and 2222 are ordinary numbers
Program will take in a value n t times, where for each n, we need to output # of ordinary numbers from 1 to n.
 */

/*
Everytime floor(log10(n)) increases by 1, the output is to be increased by 9.
Just make sure for the final iteration (# of digits equal to # of digits in n), you check for each ordinary number.
 */


import java.util.Scanner;

public class OrdinaryNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0;i < t ;i++){
            int n = scan.nextInt();
            int temp = n;
            int size = 0;
            int num = 0;
            while(temp!=0){
                temp = temp/10;
                size++;
                num = num*10+1;
            }
            int count = 0;
            int val = num;
            while(n >= val){
                count++;
                val+=num;
            }
            System.out.println((size-1)*9+count);
        }
    }
}
