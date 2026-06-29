
class Solution {

    //     void swap(int[] arr, int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    // void segregate0and1(int[] arr) {
    //     int i = 0;
    //     int j = arr.length-1;
    //     while(i < j){
    //         if(arr[i] == 0){
    //             i++;
    //         }
    //         else if(arr[j] == 1){
    //             j--;
    //         }
    //       else {
    //           swap(arr,i,j);
    //           i++;
    //           j--;
    //           }
    //     }
    // }
    public static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void segregate0and1(int[] arr) {
        // find first 1 and put at i
        //j = i+1
        //on gettting 0 at j, swap with i and do i++
        // j increase continuously

        int i = -1;
        int n = arr.length;

        for (int k = 0; k < n; k++) {
            if (arr[k] == 1) {
                i = k;
                break;
            }
        }

        if (i == -1) {
            return;
        }

        for (int j = i + 1; j < n; j++) {
            if (arr[j] == 0) {
                swap(i, j, arr);
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0and1(arr);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

}
