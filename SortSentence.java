// link - https://leetcode.com/problems/sorting-the-sentence/

public class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] str = s.split(" ");
        String[] str2 = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            char ch = str[i].charAt(str[i].length() - 1);
            int n = ch - '0';
            str2[n - 1] = str[i].substring(0, str[i].length() - 1);
        }
        String str3 = "";
        for (int i = 0; i < str2.length-1; i++) {
            str3 += str2[i].concat(" ");
        }
    
        System.out.println(str3+str2[str.length-1]);
    }
}
