
// make triplets then do custom sorting according to the question


static class mark implements Comparable<mark>{
    int phy;
    int chem ; 
    int math;
    
    mark(){
        
    }
    mark(int phy, int chem, int math){
        
        this.phy = phy;
        this.chem = chem;
        this.math = math;
    }
    public int compareTo(mark o) {
        if(this.phy != o.phy) {
            return this.phy - o.phy;
        }else if( this.chem != o.chem) {
              return o.chem - this.chem;
        }else{
            return this.math - o.math;
        }
    }
}
public static void customSort(int[]phy,int[]chem,int[]math) {
    //write your code here
    int n = phy.length;
    mark[] arr = new mark[n];
    
    for( int i = 0 ; i < n ; i++) {
        arr[i] = new mark(phy[i],chem[i], math[i]);
    }
    Arrays.sort(arr);
    
    for( int i = 0 ; i < n ; i++) {
        phy[i] = arr[i].phy;
        chem[i] = arr[i].chem;
        math[i] = arr[i].math;
    }
    
    
}