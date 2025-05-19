import java.util.*;

class Problem8{
    public Integer solution(String hay, String needle){
        int n = needle.length();
        for(int i =0;i<hay.length();i++){
            if(hay.substring(i,i+n).equals(needle))
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Haystack and needle");
        String hay = sc.next();
        String needle = sc.next();
        Problem8 obj = new Problem8();
        Integer result = obj.solution(hay, needle);
        System.out.println(result);
    }

}