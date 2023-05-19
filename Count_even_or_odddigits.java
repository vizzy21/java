public class DigitManipulation {
    public static void main(String[] args) {
        int number = 123456;
        int evenCount = countEvenDigits(number);
        int oddCount = countOddDigits(number);
        System.out.println("Count of even digits: " + evenCount);
        System.out.println("Count of odd digits: " + oddCount);
    }

    private static int countEvenDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    private static int countOddDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
