public class pivotindex {
    public int pivotIndex(int[] nums) {
              
        // find sum 
        int sum = 0;
        for( int val : nums){
            sum += val;
        }
        
        // initialize lsum and rsum
        int lsum = 0;
        int rsum = sum;
        int index = -1;
        
        for( int i = 0 ; i < nums.length ; i++) {
           // sabse pehle rsum calculate kro ( ele ko rsum m minus krke)
            rsum -= nums[i];
            
            
            // check 
            if(lsum == rsum) {
                return i;
            }
            
            // send rsum as it as and updatae lsum for next iteration
            
            lsum += nums[i];
        }
        return -1;
    }
}
