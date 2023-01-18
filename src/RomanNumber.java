public class RomanNumber {
    private final String romanNumber;
    public RomanNumber(int decimalNumber) {
        this.romanNumber = toRomanNumber(decimalNumber);
    }

    private String toRomanNumber(int decimalNumber) {
        String[] romanStrings = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] decimalArabic = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        validate(decimalNumber);

        StringBuilder result = new StringBuilder();
        int index = romanStrings.length -1;
        while(index > -1) {

            if(decimalNumber/decimalArabic[index] <= 0) {
                index--;
                continue;
            }

            for(int i=0; i< decimalNumber/decimalArabic[index]; i++) {
                result.append(romanStrings[index]);
            }
            decimalNumber %= decimalArabic[index];
            index--;
        }

        return result.toString();
    }

    private void validate(int decimalNumber) {
        if(decimalNumber < 1 || 3999 < decimalNumber) {
            throw new IllegalArgumentException();
        }
    }

    public String value() {
        return this.romanNumber;
    }
}
