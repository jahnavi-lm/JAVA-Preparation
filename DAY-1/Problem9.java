import java.util.*;

class Problem9{
    public int solution(String str){
        Set<Character> set = new HashSet<>();
        int start = 0, maxlen = 0;
        for (int i=0; i<str.length();i++){
            char currentchar = str.charAt(i);

            while(set.contains(currentchar)){
                set.remove(str.charAt(start));
                start++;
            }
            set.add(currentchar);

            int currlen = i - start + 1;
            if(currlen > maxlen){
                maxlen = currlen;
            }
        }
        return maxlen;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Problem9 obj = new Problem9();
        int maxlen = obj.solution(str);
        System.out.println(maxlen);
    }
}