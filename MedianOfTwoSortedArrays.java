// Leetcode 4 Hard
// Brutforce --> merged them then find the median 

// TC --> O( n+m)
// SC --> O( n+m)


// Optimised Solution ------------>

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // hum chote array p cut marna prefer krenge
        if( nums2.length < nums1.length) return findMedianSortedArrays(nums2,nums1);
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int lo = 0, hi = n1;
        while( lo <= hi) {
            // calculating cut1 and cut2;
            int cut1 = ( lo + hi) >> 1;
            int cut2 = ( n1 + n2 + 1)/2 - cut1;
            
            // intializing left1, left2, right1, right2
            
            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int left2= cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2-1];
            
             int right1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
            int right2= cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];
            // cross checking
            if( left1 <= right2 && left2 <= right1){
                 if( (n1 + n2)% 2 == 0)
                   return (Math.max( left1, left2) + Math.min( right1,right2)) / 2.0;
                 else
                     return Math.max(left1,left2);
            }else if( left1 > right2) {
                hi = cut1 - 1;
            }else{
                lo = cut1 + 1;
            }
        }
        return 0.0;
    }
}