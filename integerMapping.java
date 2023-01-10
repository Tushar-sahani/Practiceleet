package Java.Practiceleet;
public class integerMapping {
    public static void main(String[] args) {
        String s = "1326#";
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i) != '#'){
                int n = s.charAt(i) - '0';
                sb.append((char)(96+n));
                i--;
            }else{
                String str = s.substring(i-2, i);
                int m = (str.charAt(0)-'0')*10 + (str.charAt(1) - '0');
                sb.append((char)(96+m));
                i=i-3;
            }
        }
        System.out.println(sb.reverse());
    }
}
