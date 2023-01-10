// link - https://leetcode.com/problems/goal-parser-interpretation/
package Java.Practiceleet;
public class GoalParsher {
    public static void main(String[] args) {
        String command = "()(al)G()()(al)";
        char[] str = command.toCharArray();
        int i=0;
        String str2 = "";
        while(i<str.length){
            if(str[i]=='('&& str[i+1]==')'){
                str2 += "o";
                i = i + 2;
            }
            else if(str[i]=='(' && str[i+1]=='a'){
                str2 +="al";
                i = i + 4;
            }
            else{
                str2 += str[i]; 
                i++;
            }
        }
        System.out.println(str2);
    }
}