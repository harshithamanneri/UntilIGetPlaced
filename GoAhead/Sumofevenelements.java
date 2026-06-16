public class Sumofevenelements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = sumOfEvenElements(arr);
        System.out.println("The sum of even elements is: " + sum);
    }

    public static int sumOfEvenElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}