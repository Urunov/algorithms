/**
 * @Created 15 / 05 / 2020 - 3:07 PM
 * @project DuplicateZeros
 * @Author Hamdamboy
 */
public class DuplicateZeros {
    //
    public static void main(String[]args) {
        int[] arr = {1, 0, 2, 4, 0, 5};
        int possibleDuplicate = 0;
        int len = arr.length - 1;

        /***
         *  Find the number of zeros to be duplicated
         *  Stopping when left points beyond the last element in the original array
         *  when would be part of the modified array
         * */

        for (int left = 0; left <= len - possibleDuplicate; left++) {

            // count the zeros in the array
            if(arr[left]==0) {

                /***
                 *  1. Case (never duplicate zero): This zero can't be duplicated. We have no more space,
                 *      as lest is pointing to the last element which would be included.
                 * */

                if(left ==len - possibleDuplicate) {
                    // For this zero we just copy it without duplication.
                    arr[len] = 0;
                    len --;
                    break;
                }
                possibleDuplicate++;
            }
        }

        // Start backwards from the last element which would be part of the array.
        int last = len - possibleDuplicate;
        // Copy zero twice, and zero once.

        for(int i=last; i>=0; i--) {
            if(arr[i] ==0){
                arr[i+possibleDuplicate] =0;
                possibleDuplicate--;
                arr[i+possibleDuplicate] = 0;
            } else{
                arr[i+possibleDuplicate] = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
