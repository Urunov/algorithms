import java.util.LinkedList;

/**
 * @Created 28 / 04 / 2020 - 9:54 AM
 * @project 05.Staircase
 * @Author Hamdamboy
 */
public class Staircase {
    public static void main(String []args){

        String space = " "; // 1 space
        String sharp = "#";
        int n=10;

        for(int i=0; i<n; i++){

            for(int sp = 0; sp<=n-i-2; sp++){
                System.out.print(space);
            }

            for(int j=0; j<=i; j++) {
                System.out.print(sharp);
            }
            System.out.println();
        }
    }
}
/***
 *  Reference:
 *  https://www.hackerrank.com/challenges/staircase/problem
 *
 * **/