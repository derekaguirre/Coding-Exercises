package Completed.Strings;

//Submission: https://leetcode.com/problems/defanging-an-ip-address/submissions/1451083870

public class DefangIPAddresses {

    public static void main(String[] args) {
        String test = "1.2.3.4";
        System.out.println(defangIPaddr(test));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    
}
