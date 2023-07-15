package Progress;

//Problem: https://leetcode.com/problems/maximum-fruits-harvested-after-at-most-k-steps/description/

public class MaxFruitsHarvestedWithKSteps {
    public static void main(String[] args) {
        // int startPos = 5;
        // int steps = 4;
        // int[][] fruits = { { 2, 8 },
        // { 6, 3 },
        // { 8, 6 } };

        // int[][] fruits = {
        // { 0, 9 },
        // { 4, 1 },
        // { 5, 7 },
        // { 6, 2 },
        // { 7, 4 },
        // { 10, 9 }
        // };
        // System.out.println("FINAL EVALUATION: " + maxTotalFruitsCheckBothSides(fruits, startPos, steps));
        
        // int[][] fruits = { { 200000, 10000 } };
        // System.out.println("FINAL EVALUATION: " + maxTotalFruitsCheckBothSides(fruits, 200000, 200000));
        int[][] fruits = {{0,7},{7,4},{9,10},{12,6},{14,8},{16,5},{17,8},{19,4},{20,1},{21,3},{24,3},{25,3},{26,1},{28,10},{30,9},{31,6},{32,1},{37,5},{40,9}};
        

        System.out.println("FINAL EVALUATION: " + maxTotalFruitsCheckBothSides(fruits, 21, 30));
        //Expect: 71
    }

    // // This approach will call for the max value of two approaches
    // // Approach 1: Checking if the left OR right is biggest and returning that
    // // Approach 2: Checking for both sides using two pointers to find the biggest
    // // number to return

    // // The biggest value of fruits from either approach using Math.max() will be the
    // // final answer.
    // public static int maxTotalFruits(int[][] fruits, int startPos, int totalSteps) {
    //     int leftSteps = 0, rightSteps = 0;
    //     int leftTotal = 0, rightTotal = 0;
    //     int leftFruit = 0, rightFruit = 0;

    //     for (int rows = 0; rows < fruits.length; rows++) {

    //         // So I wanna see if the position is smaller than the startPos
    //         // If so then I check how many possible harvests can be made on the left side
    //         if (fruits[rows][0] < startPos) {
    //             // System.out.println("Smaller: " + fruits[rows][0]);
    //             // Distance between startPos and first left harvest
    //             leftSteps = Math.abs(fruits[rows][0] - totalSteps);

    //             // If distance does not go above the totalSteps then it is reachable and
    //             // therefore valid
    //             if (Math.abs(leftTotal - leftSteps) < totalSteps) {
    //                 leftTotal += Math.abs(leftTotal - leftSteps);
    //                 // Count fruit
    //                 leftFruit += fruits[rows][1];
    //             }

    //             // System.out.println("Left steps: " + leftSteps + "\nleftTotalSteps: " +
    //             // leftTotal + "\nleftFruits: " + leftFruit);
    //         } else { // If bigger check how many possible harvests can be made on the right side
    //                  // System.out.println("Bigger " + fruits[rows][0]);
    //                  // Distance between startPos first right harvest
    //             rightSteps = Math.abs(fruits[rows][0] - totalSteps);

    //             // If distance does not go above the totalSteps then it is reachable and
    //             // therefore valid
    //             if (Math.abs(rightTotal - rightSteps) < totalSteps) {
    //                 rightTotal += Math.abs(rightTotal - rightSteps);
    //                 // Count fruit
    //                 rightFruit += fruits[rows][1];
    //             }
    //             // System.out.println("Right steps: " + rightSteps + "\nrightTotalSteps: " +
    //             // rightTotal + "\nrightFruits: "+ rightFruit);

    //         }
    //         System.out.println();
    //     }
    //     // System.out.println("Final Left Fruit: " + leftFruit + "\nFinal Right Fruit: "
    //     // + rightFruit);
    //     // System.out.println("Most fruit: " + Math.max(leftFruit, rightFruit));
    //     int maxFruit = Math.max(leftFruit, rightFruit);
    //     maxFruit = Math.min(maxTotalFruitsCheckBothSides(fruits, startPos, totalSteps), maxFruit);
    //     return maxFruit;
    // }

    // Will check both left and right
    public static int maxTotalFruitsCheckBothSides(int[][] fruits, int startPos, int totalStepsLeft) {
        System.out.println("Starting values: \t" + "StartPos: " + startPos + "\ttotalSteps: " + totalStepsLeft);
        int originalStart = startPos, originaltotalStepsLeft = totalStepsLeft;
        int leftSteps = 0, rightSteps = 0;
        int totalFruit = 0;
        int maxFruit = 0;

        // Iterate through list
        for (int rows = 0; rows < fruits.length; rows++) {

            // Check if left value is reachable
            leftSteps = Math.abs(startPos - fruits[rows][0]);
            System.out.println("Current index of array: " + fruits[rows][0]);
            
            if (leftSteps <= totalStepsLeft) {
                // If so then update steps, position and fruit
                totalStepsLeft -= leftSteps;
                startPos = fruits[rows][0];
                totalFruit += fruits[rows][1];
                maxFruit = Math.max(totalFruit, maxFruit);
                System.out.println("Left fruit added. TotalFruit: " + totalFruit);

                // Then check right side
                for (int rowsRight = rows + 1; rowsRight < fruits.length; rowsRight++) {
                    // since every point after this is a bigger position, we dont need to verify
                    // them
                    // Check if the next right one is reachable
                    rightSteps = Math.abs(startPos - fruits[rowsRight][0]);
                    System.out.println("Current index of right side: " + fruits[rowsRight][0]);

                    // If distance does not go above the totalSteps then it is reachable
                    if (rightSteps <= totalStepsLeft) {

                        totalStepsLeft -= rightSteps;
                        startPos = fruits[rowsRight][0];
                        // Count fruit
                        totalFruit += fruits[rowsRight][1];
                        maxFruit = Math.max(totalFruit, maxFruit);
                        rows++;
                        

                        System.out.println("Right fruit added. TotalFruit: " + totalFruit);
                        
                        // Otherwise the distance is too great and we should skip to the next harvest
                        // spot
                    } else {
                        // Resetting values
                        startPos = originalStart;
                        System.out.println("Resetting values");
                        totalStepsLeft = originaltotalStepsLeft;
                        maxFruit = Math.max(totalFruit, maxFruit);
                        System.out.println("Max Value: " + maxFruit);
                        totalFruit = 0;
                        break;
                    }

                }
            }
            // This is if the first element is too far, it will skip
        }

        return maxFruit;
    }
}

/*
 * 
 * {
 * {0,9},
 * {4,1},
 * {5,7},
 * {6,2},
 * {7,4},
 * {10,9}
 * }
 * 
 * 
 */