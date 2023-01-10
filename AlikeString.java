// link - https://leetcode.com/problems/determine-if-string-halves-are-alike/
package Java.Practiceleet;
class AlikeString {
    public boolean halvesAreAlike(String s) {
       char[] str = {'a','e','i','o','u','A','E','I','O','U'};
       String sc = String.valueOf(str);
       String a = s.substring(0, (s.length())/2);
       String b = s.substring((s.length())/2, s.length());
       int count1 =0,count2 =0;
       for (int i = 0; i < (s.length())/2; i++) {
            if(sc.contains(""+a.charAt(i))==true){
                count1++;
            }
            if(sc.contains(""+b.charAt(i))==true){
                count2++;
            }
       }
       
       return (count1==count2)?true:false; 
    }
}