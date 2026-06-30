class Solution {
    public int[] sortedSquares(int[] nums) {
        // int i=0;
        // int j=nums.length - 1;
        // int end = nums.length - 1;
        // int[] res = new int[nums.length];

        // while(i <= j){
        //     if(nums[i] * nums[i] <= nums[j] * nums[j]){
        //         res[end--] = nums[j] * nums[j];
        //         j--;
        //     }
        //     else{
        //         res[end--] = nums[i] * nums[i];
        //         i++;
        //     }
        // }
        // return res;



























        int n = nums.length;
        int i=0;
        int j = n-1;

        int []res = new int[n];
        int p = n-1;

        while(i <= j){
            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                res[p--] = nums[i] * nums[i];
                i++;
            }
            else{
                res[p--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}