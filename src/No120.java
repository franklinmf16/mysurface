import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.min;

public class No120 {

    public int minimumTotal(List<List<Integer>> triangle) {

        int first = triangle.get(0).get(0);

        for (int i = triangle.size() - 1; i >= 0 ; i--) {
            for (int j = 0; j < triangle.get(i).size() - 1; j++) {
                int a = triangle.get(i).get(j);
                int b = triangle.get(i).get(j + 1);
                int result = min(a,b);
                int toAdd = triangle.get(i - 1).get(j) + result;
                triangle.get(i - 1).set(j,toAdd);
            }

            if (i == 0){
                return triangle.get(0).get(0);
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2);
        List<Integer> b = Arrays.asList(3,4);
        List<Integer> c = Arrays.asList(6,5,7);
        List<Integer> d = Arrays.asList(4,1,8,3);

        List<List<Integer>> list = Arrays.asList(a,b,c,d);


        No120 ans = new No120();
        int result = ans.minimumTotal(list);
        System.out.println("result is " + result);


    }
}
