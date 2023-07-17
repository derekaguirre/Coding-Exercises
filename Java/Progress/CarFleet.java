package Progress;

public class CarFleet {

    /*
     * 
     * 
     * There are n cars going to the same destination
     * int[] position = new int[n] //position[i] = position of the ith car
     * int[] speed = new int[n] //speed[i] = speed of the ith car mph
     * destination = target miles away
     * 
     * Cars can never pass each other, but can catch up to and stay at same speed
     * The faster car will slow down to match the slower car's speed
     * The distance between these two cars is ignored (i.e., they are assumed to
     * have the same position).
     * 
     * A car fleet is some non-empty set of cars driving at the same position and
     * same speed. Note that a single car is also a car fleet, and If a car catches
     * up
     * to a car fleet right at the destination point, it will still be considered as
     * one car fleet.
     * 
     * Return the number of car fleets that will arrive at the destination.
     * 
     * Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
     * Output: 3
     * Explanation:
     * The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12.
     * The car starting at 0 does not catch up to any other car, so it is a fleet by itself.
     * The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each  other at 6.
     * The fleet moves at speed 1 until it reaches target.
     * Note that no other cars meet these fleets before the destination, so the
     * answer is 3.
     */

    // public int carFleet(int target, int[] position, int[] speed) {
    // }
}
