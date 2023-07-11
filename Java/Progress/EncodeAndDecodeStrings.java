package Progress;

import java.util.ArrayList;
import java.util.List;

//Submission: https://www.lintcode.com/submission/31413338/

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>();
        strs.add("we");
        strs.add("say");
        strs.add(":");
        strs.add("yes");

        System.out.println(encode(strs));

        List<String> decoded = decode(encode(strs));
        for (String iter : decoded) {
            System.out.println(iter);
        }

    }

    public static String encode(List<String> str) {
        StringBuilder resStr = new StringBuilder();
        // Encote message here
        for (String iter : str) {
            resStr.append(iter);
            resStr.append(":;");
        }
        return resStr.toString();
    }

    /*
     * @param str: A string
     * 
     * @return: decodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        String key = ":;";
        List<String> resArr = new ArrayList<String>();
        String[] strArr = str.split(key);
        for (int i = 0; i < strArr.length; i++) {
            resArr.add(strArr[i]);
        }
        return resArr;
    }
}
