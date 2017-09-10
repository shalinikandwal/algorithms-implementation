package leetcode;

public class reshapeMatrix {

    /**
     * Reshapes the Matrix as per the input parameters
     * @param nums returned array
     * @param r required row
     * @param c required column
     * @return reshaped array
     */
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int[][] res = new int[r][c];
            if(nums.length == 0 || nums.length * nums[0].length != r*c)
                return nums;
            int count =0;
            Queue <Integer> queue = new LinkedList < > ();
            for(int i = 0; i < nums.length; i++)
                for(int j = 0; j< nums[0].length; j++){
                    queue.add(nums[i][j]);
                }
            for(int i= 0; i<r ; i++)
                for(int j =0; j<c; j++)
                {
                    res[i][j]= queue.remove();
                }
            return res;
        }

}
