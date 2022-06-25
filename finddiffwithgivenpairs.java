bruteforce --> two loops

optimised ----> sorting then two pointer


public static void findPair(int[]arr,int target) {
    //write your code here
    Arrays.sort(arr);
    // keep both pointers at zero
    
    // increment j if target is less and increment i if target is more
    int i = 0, j = 1;
    while( i < arr.length && j < arr.length) {
        if( arr[j] - arr[i] == target){
            System.out.println( arr[i] + " " + arr[j]);
            return;
        }else if(arr[j] - arr[i] < target){
            j++;
        }else{
            i++;
        }
    }
    System.out.println(-1);
}


another optimised ---> hashmap 

public static void findPair(int[]arr,int target) {
    //write your code here
    HashMap<Integer, Integer > map = new HashMap<>();
    for( int i = 0 ; i < arr.length ; i++) {
        if( map.containsKey(arr[i])) {
            int of = map.get(arr[i]);
            int nf = of + 1;
            map.put( arr[i],nf);
        }else{
            map.put( arr[i],1);
        }
    }
    int f = 0;
    int v = 0;
    boolean flag = false;
    
    for( int i = 0 ; i < arr.length ; i++) {
        int val = target + arr[i];
        if( map.containsKey(val)){
            f = arr[i];
            v = val;
            flag = true;
            // System.out.println( arr[i] + " " + val);
            
        }
    }
    if( flag == true) {
        System.out.println( f + " " + v);
    }else{
        System.out.println(-1);
    }
    
    
}