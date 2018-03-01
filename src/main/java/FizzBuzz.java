public class FizzBuzz {

    private static final String ZERO_CASE = "0";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String check(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("Negative values are not permitted!");
        }
        if (input == 0) {
            return ZERO_CASE;
        }
        String result = "";
        if (isFizz(input)) {
            result += FIZZ;
        }
        if (isBuzz(input)) {
            result += BUZZ;
        }
        if (isWhizz(input)) {
            result += WHIZZ;
        }

        if (result.isEmpty()) {
            return String.valueOf(input);
        } else {
            return result;
        }

    }

    private boolean isWhizz(int input) {
        boolean divisibleBy7 = input % 7 == 0;
        boolean containsDigit7 = String.valueOf(input).contains("7");
        return divisibleBy7 || containsDigit7;
    }

    private boolean isBuzz(int input) {
        boolean divisibleBy5 = input % 5 == 0;
        boolean containsDigit5 = String.valueOf(input).contains("5");
        return divisibleBy5 || containsDigit5;
    }

    private boolean isFizz(int input) {
        boolean divisibleBy3 = input % 3 == 0;
        boolean containsDigit3 = String.valueOf(input).contains("3");
        return divisibleBy3 || containsDigit3;
    }
}
