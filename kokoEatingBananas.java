public class kokoEatingBananas {
    
    public static int minEatingSpeed(int[]piles,int h) {
        //write your code here
        int max = Integer.MIN_VALUE;
        for( int val : piles) {
            max = Math.max( max, val);
        }
        if( h == piles.length) return max;
        
        int lo = 0;
        int hi = max;
        int speed = Integer.MAX_VALUE;
        while( lo <= hi) {
            int sp = lo + ( hi - lo) / 2;
            if( isPossible( piles, sp, h) == true) {
                speed = Math.min(speed,sp);
                hi = sp - 1;
            }else{
                lo = sp + 1;
            }
        }
        return speed;
        
        
    }
    public static boolean isPossible(int[] piles, int sp, int h) {
        
        int time = 0;
        for( int i = 0; i < piles.length ; i++) {
            time += (int)Math.ceil(piles[i]*1.0/sp);
        }
        return time <= h;
    }

}


// Similar question
// Find The Smallest Divisor Given A Threshold


public static int findSmallestDivisor(int[]piles,int h) {
    //write your code here
      int max = Integer.MIN_VALUE;
    for( int val : piles) {
        max = Math.max( max, val);
    }
    if( h == piles.length) return max;
    
    int lo = 0;
    int hi = max;
    int speed = Integer.MAX_VALUE;
    while( lo <= hi) {
        int sp = lo + ( hi - lo) / 2;
        if( isPossible( piles, sp, h) == true) {
            speed = Math.min(speed,sp);
            hi = sp - 1;
        }else{
            lo = sp + 1;
        }
    }
    return speed;
}
public static boolean isPossible(int[] piles, int sp, int h) {
    
    int time = 0;
    for( int i = 0; i < piles.length ; i++) {
        time += (int)Math.ceil(piles[i]*1.0/sp);
    }
    return time <= h;
}