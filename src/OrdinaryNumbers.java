
import java.util.Scanner;

public class OrdinaryNumbers {

    public static void main(String[] args) {
        // write your code here
        int n,t;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        for(int i = 0;i<t ;i++){
            n = scan.nextInt();
            int temp = n;
            int size = 0;
            int num = 0;
            while(temp!=0){
                temp = temp/10;
                size++;
                num = num*10+1;
            }
            int count = 0;
            while(n >= num){
                count++;
                num+=num;
            }
            System.out.println((size-1)*9+count);
        }
    }
}
