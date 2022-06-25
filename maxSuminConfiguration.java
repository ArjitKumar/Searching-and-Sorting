
// its like ap 

// use this formula for calculation ---> 

// Si+1 = Si + sum - n*arr[n-i-1]; // 

// for subtracting the last index everytime we use n*arr[n-i-1]


public class maxSuminConfiguration {
    public static int maximise(int[]arr) {
        int sum = 0;
        int n = arr.length;
        int S0 = 0;
        for( int i = 0 ; i < n ; i++) {
            sum += arr[i];
            S0 += arr[i] * i;
        }
        
        int max = S0;
        int Si = S0;
        for( int i = 0 ; i < n - 1; i++) { // hm pehle hi S0 cal kr chuke h isliy n-1
            int Sip1 = Si + sum - n*arr[n-i-1];
            max = Math.max(max,Sip1);
            Si = Sip1;
        }
        
        return max;
     }
}
