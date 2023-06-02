import java.util.Arrays;

//Submission: https://leetcode.com/problems/assign-cookies/submissions/962089286/

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gPointer = 0, sPointer = 0, counter = 0;
        while (gPointer != g.length && sPointer != s.length) {
            // Both elements match increment counter and move pointers
            if (g[gPointer] <= s[sPointer]) {
                counter++;
                gPointer++;
                sPointer++;
            }
            // Cookie is too small, move cookie pointer
            else if (g[gPointer] > s[sPointer]) {
                sPointer++;
            } else {
                gPointer++;
            }

        }
        return counter;
    }
}
