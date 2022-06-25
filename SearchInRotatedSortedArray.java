public class SearchInRotatedSortedArray {
    public static int find(int[]arr,int target) {
        //write your code here
        int lo=  0;
        int hi = arr.length - 1;
        while( lo <= hi) {
            int mid = ( lo + hi) / 2;
            if( arr[mid] == target) {
                return mid;
            }else if( arr[lo] <= arr[mid]){
                // agr lo se mid sorted h to yahan check kro
                // ab check krenge ky target yahan lie krta h ya nhi
                if(target >= arr[lo] && target < arr[mid]){
                    // to high ko mid -1 pr rakh do
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            }else if( arr[mid] <= arr[hi]){
                 // agr mid se hi sorted h to yahan check kro
                  if(target <= arr[hi] && target > arr[mid]){
                    // to high ko mid -1 pr rakh do
                    
                    lo = mid + 1;
                }else{
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
