
public class BubbleSort {
    public static void main(String args[]) {
        int[] nums = { 5, 4, 3, 2, 1 };
        System.out.println("Before");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        boolean swap = true;
        // bubble sort
        // but the catch is if the array in one pass doesnt swap anything, it is true
        // that it wont pass it in other tries
        // so in order to bulletproof our system, we would add a boolean flag to the
        // code to stop it iterating over
        // and over

        for (int i = 0; i < nums.length; i++) {
            // outer loop
            for (int j = 1; j < nums.length - i; j++) {
                // inner loop to traverse
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swap = false;
                }
                if (swap == false)
                    break;
            }
        }

        System.out.println();
        System.out.println("After");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}