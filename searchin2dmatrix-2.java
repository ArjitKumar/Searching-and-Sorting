
// Properties of matrix

// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

    // Integers in each row are sorted in ascending from left to right.
    // Integers in each column are sorted in ascending from top to bottom.



public class searchin2dmatrix-2 {
  
    public boolean search( int[][] matrix, int target)
    {   int j = matrix[0].length - 1;
        int i = 0;
          while( i < matrix.length && j >= 0){ // imp to write j>=0
              if( matrix[i][j] == target) {
                  return true;
              }else if(  matrix[i][j] > target){
                    j--;
              }else{
                  i++;
              }
          }
     
     return false;
        
        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        boolean ifFound = search( matrix, target);
        return ifFound;
    }

}
