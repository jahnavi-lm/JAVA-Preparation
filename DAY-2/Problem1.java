import java.util.*;
class Problem1 {
    public List<List<String>> solution(String[] str){
        Map<String, List<String>> map = new HashMap<>();
        for(String s: str){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings");
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        Problem1 obj = new Problem1();
        List<List<String>> result = obj.solution(str);
        System.out.println(result);
    }
}