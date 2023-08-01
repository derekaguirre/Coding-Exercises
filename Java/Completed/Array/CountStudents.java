package Completed.Array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Submission: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/submissions/984256399/

public class CountStudents {
    public static void main(String[] args) {
        // //test1
        // int[] students = {1,1,0,0};
        // int[] sandwiches = {0,1,0,1};
        // test2
        int[] students = { 1, 1, 1, 0, 0, 1 };
        int[] sandwiches = { 1, 0, 0, 0, 1, 1 };
        System.out.println(countStudents(students, sandwiches));
    }
    // If the student likes the sandwich they will take it and leave the queue
    // OR they will skip it and go to the end of the queue

    // Will continue until no one wants the top sandwich and thus no one wants to
    // eat.

    public static int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        // Pushing info on the data structures
        for (int i = 0; i < sandwiches.length; i++) {
            q.add(students[i]);
            stack.push(sandwiches[(sandwiches.length - 1) - i]);
        }

        int timesSkipped = 0;
        while (!(stack.isEmpty())) {
            if (timesSkipped == stack.size())
                break;
            // if the student does not like the sandwich
            if (q.peek() != stack.peek()) {
                int pickyStudent = q.poll();
                q.add(pickyStudent);
                timesSkipped++;
            }
            // if the student likes the sandwich
            if (q.peek() == stack.peek()) {
                timesSkipped = 0;
                stack.pop();
                q.poll();
            }

        }

        return q.size();
    }
}
