public class findKclosest {
    
        public class Pair implements Comparable<Pair>{
            int val;
            int gap;
            
            Pair( int val, int gap) {
                this.val = val;
                this.gap = gap;
            }
    
            public int compareTo(Pair o){
                if(this.gap != o.gap) {
                    return this.gap - o.gap;
                }else{
                    return this.val - o.val;
                }
            }
        }
        
        // using arrayList
    //     public List<Integer> findClosestElements(int[] arr, int k, int x) {
    //         ArrayList<Pair> list = new ArrayList<>();
    //         for( int i = 0 ; i < arr.length ; i++) {
    //             list.add( new Pair(arr[i],Math.abs(arr[i] - x)));
    //         }
    //         Collections.sort(list);
    //          ArrayList<Integer> ans = new  ArrayList<>();
    //         for( int i = 0 ; i <  k ; i++) {
    //              ans.add(list.get(i).val);
    //         }
    //         Collections.sort(ans);
    //         return ans;
            
    //     }
        
        // Using priority queue
        //     TC --> Nlogk + klogk ===== Nlogk
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            ArrayList<Integer> list = new ArrayList<>();
            PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()); 
            // creating max heap
            
            // at max pq m k hi log h
            
            for( int i = 0 ; i < arr.length ; i++) {
                if(pq.size() < k) {
                    pq.add(new Pair(arr[i],Math.abs(arr[i] - x)));
                }else{
                    // we compare ki gap agr km h to isse dal do
                    if( pq.peek().gap > Math.abs(arr[i] - x)){
                        pq.remove();
                        pq.add(new Pair(arr[i],Math.abs(arr[i] - x)));
                    }
                }
            }
           
           while( pq.size() != 0) {
               Pair mp = pq.remove();
               list.add(mp.val);
           }
           Collections.sort( list);
            return list;
                           
           
            
        }

        // Most Optimised using binary search 

        TC ---> roughly O(n);
        int start = 0, end = arr.length-k;
        
        while(start<end) {
            int mid = (start + end)/2;
            if (x - arr[mid] > arr[mid+k]-x)
                start = mid + 1;
            else
                end = mid;
        }

        List<Integer> results = new ArrayList<Integer>();
        for(int i=start;i<start+k;i++){
            results.add(arr[i]);
        }
        return results;
       
}



