package binarySearchQuestion;
// https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
public class FindTheKthElementInTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,6,7,9};
        int[] nums2 = {1,4};
        int ans = findElement(nums1, nums2, 2);
        System.out.println(ans);

    }
    public static int findElement(int[] nums1, int[] nums2, int k){
        if (nums1.length > nums2.length) {
            return findElement(nums2, nums1, k);
        }
        int n = nums1.length;
        int m = nums2.length;
        int start = Math.max(0,k - m);
        int end = Math.min(k, n);
        while (start <= end) {
            int cut1 = start + (end - start)/2;
            int cut2 = k - cut1;
            int l1 = (cut1 == 0)?Integer.MIN_VALUE:nums1[cut1-1];
            int l2 = (cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            int r1 = (cut1 == n)?Integer.MAX_VALUE:nums1[cut1];
            int r2 = (cut2 == m)?Integer.MAX_VALUE:nums2[cut2];
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }else if (l2 > r1) {
                start = cut1 + 1;
            }else {
                end = cut1 -1;
            }
        }
        return -1;
    }
}
