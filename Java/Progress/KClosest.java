package Progress;

//Problem: https://leetcode.com/problems/k-closest-points-to-origin/description/

public class KClosest {
    public static void main(String[] args) {
        // int[][] points = { { 1, 3 }, { -2, 2 } };
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        // int[][] points = { { 0, 1 }, { 1, 0 } };

        kClosest(points, 2);

    }

    public static int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        int resultRow = 0;

        double min = Integer.MAX_VALUE;
        for (int iter = 0; iter < result.length; iter++) {
            // Set value of min with the first evaluation in the points list
            // Retrieve the x and y points of every data point
            double currentMin = Integer.MAX_VALUE;
            for (int rows = 0; rows < result[iter].length; rows++) {
                
                // Evaluate both sides of equation
                double side1 = Math.pow(points[rows][0] - 0, 2);
                double side2 = Math.pow(points[rows][1] - 0, 2);
                double distance = Math.sqrt(side1 + side2);

                // && currentMin < min
                // When smallest is found, save it to result
                System.out.println("Min: " + min);
                System.out.println("currentMin: " + currentMin);
                System.out.println("distance: "+ distance);
                System.out.println("is 'distance:"+distance+ "' <= 'min: " + min+"'? " + (distance <= min && distance < currentMin));
                System.out.println();
                if(currentMin > min && currentMin != Integer.MAX_VALUE){
                    System.out.println("found a currentMin bigger than min");
                }
                if (distance <= min && distance < currentMin) {
                    // This means the current minimum is distance
                    currentMin = distance;
                    System.out.println("Current Min: " + currentMin);
                    
                    // Check if the distance is the second largest
                    // If distance is >= to min
                    // If the first point in the result does not match the current point
                    // If the second point in the result does not match the current point
                    if (distance == min && result[rows][0] != points[rows][0] && result[rows][1] != points[rows][1]) {
                        System.out.println("same distance at different points found, updating the result");
                        resultRow++;
                        result[resultRow][0] = points[rows][0];
                        result[resultRow][1] = points[rows][1];
                        iter++;
                        System.out.println("result[" + resultRow + "][0] = " + points[rows][0] + "\n" +
                    "result[" + resultRow + "][1] = " + points[rows][1]);
                        break;
                    }
                    
                    // Update the result
                    System.out.println("unique min found, updating the result");
                    result[resultRow][0] = points[rows][0];
                    result[resultRow][1] = points[rows][1];
                    
                    System.out.println("result[" + resultRow + "][0] = " + points[rows][0] + "\n" +
                    "result[" + resultRow + "][1] = " + points[rows][1]);
                    // min = distance;
                }
                
                //update the current min 
            }
            System.out.println("Inner loop done, updating the min");
            min = Math.min(min, currentMin);
            
            resultRow++;
        }

        return result;
    }
}
