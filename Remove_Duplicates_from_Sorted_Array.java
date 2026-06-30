class Solution {
    public static int removeDuplicates(int[] nums) {
        // int j=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[j] = nums[i];/
        //         j++;
        //     }
        // }
        // return j;




        int n = nums.length;
        int i=0;
        int j=i+1;

        while(j < n){
           if(nums[i] == nums[j]){
            // j++;
           }
           else{
            i++;
            nums[i] = nums[j];
           }
           j++;
        }

        return i+1;


    }

    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);
        System.out.print(ans);
    }
}