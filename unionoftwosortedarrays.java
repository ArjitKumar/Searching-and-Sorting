// Bruteforce -> copy all elements in arraylist then sort and remove duplicates

// Another approach --> TreeSet( adds elements in sorted order) 

// Another appoach --> use set to add elements then copy the ele in list and then sort






BEST APPROACH ----> TC = O(N+M)
SC = O(1)
/*You have to complete union function and return an Arraylist which contains union elements of the two arrays*/
public static ArrayList<Integer> union(int[] a,int[] b) {
    //write your code here
     ArrayList<Integer> list = new  ArrayList<Integer>();
     
     int i = 0 ,j = 0;
     while( i < a.length  && j  < b.length) {
         if(a[i] == b[j]) {
             if( list.size() > 0 && list.get(list.size() - 1) != a[i] ){
                 list.add(a[i]);
             }
             if( list.size() == 0) {
                 list.add(a[i]);
             }
            //  list.add(a[i]);
             i++;
             j++;
         }else if( a[i] < b[j]) {
               if( list.size() > 0 && list.get(list.size() - 1) != a[i] ){
                 list.add(a[i]);
             }
              if( list.size() == 0) {
                 list.add(a[i]);
             }
             i++;
         }else{
               if( list.size() > 0 && list.get(list.size() - 1) != b[j] ){
                 list.add(b[j]);
             }
              if( list.size() == 0) {
                 list.add(b[j]);
             }
             j++;
         }
     }
     while( i < a.length) {
          if(list.get(list.size() - 1) != a[i] ){
                 list.add(a[i]);
             }
             i++;
     }
     while( j < b.length) {
          if(list.get(list.size() - 1) != b[j] ){
                 list.add(b[j]);
             }
             j++;
     }
    return list;
}
{
    
}
