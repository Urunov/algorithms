/**
 * @Created 15 / 05 / 2020 - 5:23 PM
 * @project MessingArrays
 * @Author Hamdamboy
 */
public class MessingArrays {
    public static void main(String[]args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n=3, m = 3;

        int len = n+m;

        for(int i=0; i<len; i++) {
            if(nums2[len-m-i] >= nums1 [len-n-i]) {
                nums1[len-i] = nums2[len-m-i];
            } else {
                nums1[len-i] = nums1[len-n-i];
            }
        }

        for(int i=0; i<len; i++){
            System.out.println(nums1[i]);
        }
    }
}
