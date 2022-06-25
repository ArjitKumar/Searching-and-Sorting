public class gfgrooftop {
    public static int findMaxSteps(int[]arr) {
        //write your code here
       
      // create 2 var maxcount and currcount and check if ( arr[i] < arr[i+1])
    //   if yes increment curr count
    // in else part contribute the ans 
    // check if currcount > ms update currcount and set currcount  = 0
    // and finarlly when loop ends check for ms because last comparison reh jaega
    int ms = 0;
    int cc = 0;
    for( int i = 0 ; i < arr.length - 1 ; i++) {
        if( arr[i] < arr[i+1]) {
            cc++;
        }else{
            ms = Math.max(cc,ms);
            cc = 0;
        }
    }
     ms = Math.max(cc,ms);
    return ms;
    
    }
}
