public class FindSecondNum {
    public static void main(String[] args) {

        int[] a = {2, 4, 5, 6, 7, 8, 5, 4, 9, 1, 6};

        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second largest number: " + secondLargest);
    }
}
