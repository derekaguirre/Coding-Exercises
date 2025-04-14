package Completed.Math;

public class HappyNumber {
    public static void main(String[] args) {
        isHappy(100);
    }

    public static boolean isHappy(int n) {
        int counter = 0;
        // Maintaining a global variable
        int squaredSum = 0;
        int happyNumber = n;
        while (counter < 10000) {
            String stringNumber = Integer.toString(happyNumber);

            // Process the current potential happy number
            for (int current = 0; current < stringNumber.length(); current++) {
                int conversion = stringNumber.charAt(current) - '0';
                
                //Square digit
                squaredSum += (Math.pow(conversion, 2));
                System.out.println("Adding "+ conversion + "^2 to the squaredSum of " + squaredSum);
            }
            // Keep squaring the numbers
            // If the sum of all of the squares == 1, happy value is found
            if(squaredSum == 1){
                System.out.println("Happy Number found");
                return true;
            }
            // Check if the result only contains a single "1"
                //if the condition is met, "break" the loop
            happyNumber = squaredSum;
            squaredSum = 0;
            counter++;
        }
        System.out.println("Happy number not found");
        return false;
    }
}
