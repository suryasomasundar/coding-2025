package arrays;

public class productArrayExceptSelf {

    public static int[] productArray(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Calculate the product of all elements to the left of each element
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate the product of all elements to the right of each element and multiply with the left product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productArray(nums);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
