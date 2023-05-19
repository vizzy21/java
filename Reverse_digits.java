public class DigitManipulation {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseDigits(number);
        System.out.println("Reversed digits: " + reversed);
    }

    private static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
