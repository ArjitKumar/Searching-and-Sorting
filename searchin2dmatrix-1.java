// Approach ---> Apply two step binary search 

// 1.find potential row using binary search2
// 2. then find the target in potential row using binary search


// Properties of matrxi matter in both search2d matrix questions

// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.




public static int prow( int[][] matrix, int target){
    int i = 0;
    int j = matrix.length - 1;
    while( i <= j) {
        int mid = ( i + j) / 2;
        if(matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target ){
            return mid;
        }else if(target > matrix[mid][0]){
            i = mid + 1;
        }else{
             j = mid - 1;
        }
    }
    return -1;
    
}
public boolean search(int[][] matrix, int r, int target ){
     int high = matrix[0].length - 1;
    int low = 0;
    while( low <= high) {
        int mid = ( low + high) / 2;
        if(target == matrix[r][mid]){
            return true;
        }else if(target > matrix[r][mid]){
            low = mid + 1;
        }else{
             high = mid - 1;
        }
    }
    return false;
}
public boolean searchMatrix(int[][] matrix, int target) {
      
    int low = prow(matrix,target);
    if( low == -1) return false;
    
    boolean isFound = search(matrix, low, target);
    
    return isFound;
   
}