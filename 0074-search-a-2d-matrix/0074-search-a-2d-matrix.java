class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;  
        int low = 0;
        int high = (r * c) - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / c;
            int column = mid % c;
            if (target > matrix[row][column]) {
                low = mid + 1;
            } else if (target < matrix[row][column]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}