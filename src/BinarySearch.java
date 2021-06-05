import java.util.ArrayList;

public class BinarySearch {
    static int find_max_of_lesser_elem(int i, int j, ArrayList<Integer> A, int elem){
//        System.out.printf("%d %d\n",i, j);
        if (j == i+1){
            if (A.get(j) <= elem) return j;
            else{
                if (A.get(i) <= elem) return i;
                else return -1;
            }
        }
        else{
            int ind = (i+j)/2;
            int val = A.get(ind);
            if (val > elem) return find_max_of_lesser_elem(i, ind, A, elem);
            if (val <=elem) return find_max_of_lesser_elem(ind, j, A, elem);
            //this line should never execute
            return -1;
        }
    }
}
