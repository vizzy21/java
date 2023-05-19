public class DigitManipulation {
    public static void main(String[] args) {
        int number = 897562;
        int largest = findLargestDigit(number);
        int smallest = findSmallestDigit(number);
        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);
    }

    private static int findLargestDigit(int number) {
        int largest = Integer.MIN_VALUE;
        while (number != 0) {
            int digit = number % 10;
            largest = Math.max(largest, digit);
            number /= 10;
        }
        return largest;
    }

    private static int findSmallestDigit(int number) {
        int smallest = Integer.MAX_VALUE;
        while (number != 0) {
            int digit = number % 10;
            smallest = Math.min(smallest, digit);
            number /= 10;
        }
        return smallest;
    }
}
