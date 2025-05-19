import java.util.*;

class Problem5 {
    public boolean solution(String word1, String word2) {
        char[] word1ch = word1.toCharArray();
        char[] word2ch = word2.toCharArray();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (char ch : word1ch) {
            set1.add((int) ch);
            map1.put((int) ch, map1.getOrDefault((int) ch, 0) + 1);
        }
        for (char ch : word2ch) {
            set2.add((int) ch);
            map2.put((int) ch, map2.getOrDefault((int) ch, 0) + 1);
        }
        l1.addAll(map1.values());
        l2.addAll(map2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        if(word1.length() == word2.length() && set1.equals(set2) && l1.equals(l2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 words: ");
        String word1 = sc.next();
        String word2 = sc.next();

        Problem5 obj = new Problem5();
        boolean result = obj.solution(word1, word2);
        System.out.println(result);
    }
}
