import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Created 28 / 04 / 2020 - 10:36 AM
 * @project 04.DiagonalDifference
 * @Author Hamdamboy
 */

public class DiagonalDifference {
    public static void main(String[]args){
        int n=3;

        List<List<Integer>> arr = new ArrayList<>();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
               arr.add(Collections.singletonList(i));
            }
        }
    }
}
/**
 *  Reference:
 *  https://www.hackerrank.com/challenges/diagonal-difference/problem
 * **/