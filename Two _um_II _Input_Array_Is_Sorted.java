class Solution{

    public static int[] twoSum(int[] numbers,int target, int[] ans){
        int n = numbers.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            if(numbers[i] + numbers[j] == target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
                j--;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int [] ans = new int[2];
        int target = 9;
        twoSum(numbers,target,ans);

        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}