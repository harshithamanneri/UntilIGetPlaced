import java.util.Arrays;
public class FindSecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int secondSmallest = findSecondSmallest(arr);
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element.");
        }
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE; // Not enough elements for a second smallest
        }

        Arrays.sort(arr);

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                return arr[i];
            }
        }

        return Integer.MAX_VALUE; // No distinct second smallest element exists
    }

    
}
