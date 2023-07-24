
public class BubbleSort {
    public static void main(String args[]) {
        int[] nums = { 5, 4, 3, 2, 1 };
        System.out.println("Before");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        // bubble sort

        for (int i = 0; i < nums.length; i++) {
            // outer loop
            for (int j = 1; j < nums.length - i; j++) {
                // inner loop to traverse
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
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