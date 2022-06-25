    class Solution {
    
        // ans unsorted area m hi milega to hm sorted part ko discard krdenge
        public int findMin(int[] arr) {
             //write your code here
            int lo = 0;
            int hi = arr.length - 1;
            // agr array pehle hi sorted to to b_search fail ho jaega to uske liye alag case handle krenge
            if( arr[lo] <= arr[hi]) {
                return arr[lo];
            }
            
    // Note : agr mid+1 vali condition second else if m likhi to 5 1 2 3 4 wala case fail ho jaega pr agr ye first likhte h to sare testcase pass honge 
    // dry run to better feel
            while( lo <= hi) {
                int mid = ( lo + hi) / 2;
                if(arr[mid] > arr[mid+1]){
                    return arr[mid+1];
                }else if( arr[mid] < arr[mid - 1]) {
                    return arr[mid];
                    // next is the discarding part
                }else if( arr[lo] <= arr[mid]) {
                    // ye part sorted h yahan nhi milega 
                    lo = mid + 1;
                }else if( arr[mid] <= arr[hi]){
                    // ye bhi sorted h yahn nhi milega
                    hi = mid - 1;
                }
            }
            return -1;
        }
    }




    // The most optimised code

    // This code is able to handle both leetcode 153 and 154( hard )


    // Approach ---> 

    // By default, if nums[lo]<nums[hi] then we return nums[lo] because the array was never rotated, or is rotated n times

    // After entering while loop, we check
    // if nums[mid] > nums[hi] => lo = mid + 1 because the minimum element is in the right half of the array
    // else if nums[mid] < nums[hi] => hi = mid because the minimum element is in the left half of the array
    // else => hi-- dealing with duplicate values
    // then we return nums[hi]		

    public int findMin(int[] arr) {
        //write your code here
       int lo = 0;
       int hi = arr.length - 1;

       if( arr[lo] < arr[hi]) {
           return arr[lo];
       }

       while( lo <= hi) {
           int mid = ( lo + hi) / 2;
           if(arr[mid] > arr[hi]) {
               lo = mid + 1;
           }else if( arr[lo] > arr[mid]){
               hi = mid;
           }else{
               hi--;
           }
       }
       return arr[lo];
   }

