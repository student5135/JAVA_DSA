public class MaxElement {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }

        int max = arr[0];  // Assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current is greater
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 12};

        int maxElement = findMax(arr);

        System.out.println("Maximum element in the array is: " + maxElement);
    }
}
