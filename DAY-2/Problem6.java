import java.util.*;

class Problem6{
    public Boolean solution(String s, String t){
        if (t.length()> s.length()){
            return false;
        }
        int[] tfreq = new int[26];
        int[] wfreq = new int[26];

        for(char c : t.toCharArray()){
            tfreq[c - 'a']++;
        }    
        for(int i =0;i<s.length();i++){
            wfreq[s.charAt(i) - 'a']++;
            if (i >= t.length()) {
            wfreq[s.charAt(i - t.length()) - 'a']--;
            }
            if (Arrays.equals(wfreq, tfreq)) {
            return true;
            }
        }
        return false;   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Strings: ");
        String s = sc.next();
        String t = sc.next();
        Problem6 obj = new Problem6();
        Boolean result = obj.solution(s, t);
        System.out.println(result);
    }

}