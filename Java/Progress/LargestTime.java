package Progress;

public class LargestTime {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(largestTimeFromDigits(arr));
    }

    public static String largestTimeFromDigits(int[] arr) {
        int[] digitArr = arr;
        int maxFirst = 0;
        int maxSecond = 0;
        int maxThird = 0;
        int maxFourth = 0;

        for (int i = 0; i < digitArr.length; i++) {
            // set first digit to highest valid number 0 - 2 and set number as visited
            // between range 0-2
            if (digitArr[i] >= 0 && digitArr[i] <= 2) {
                maxFirst = Math.max(digitArr[i], maxFirst);
                digitArr[i] = -1;
            }
        }
        // If first digit is 2, limit second digit to 3, otherwise no limit
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] != -1) {
                if (maxFirst == 2) {
                    // between range 0-3
                    if (digitArr[i] >= 0 && digitArr[i] <= 3) {
                        maxSecond = Math.max(digitArr[i], maxSecond);
                digitArr[i] = -1;

                    }
                } else {
                    maxSecond = Math.max(digitArr[i], maxSecond);
                    digitArr[i] = -1;
                }
            }
        }
        // limit 3rd digit to 5
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] != -1) {
                if (digitArr[i] >= 0 && digitArr[i] <= 5) {
                    maxThird = Math.max(digitArr[i], maxThird);
                    digitArr[i] = -1;
                }
            }
        }
        // no limit on fourth digit
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] != -1) {
                maxFourth = Math.max(digitArr[i], maxSecond);
                digitArr[i] = -1;
            }
        }

        // if any values were left then there was an invalid combination
        for (int i = 0; i < digitArr.length; i++) {
            if (digitArr[i] != -1)
                return "";
        }
        StringBuilder sb = new StringBuilder();
        sb
                .append(maxFirst)
                .append(maxSecond)
                .append(':')
                .append(maxThird)
                .append(maxFourth);

        return sb.toString();
    }
}
