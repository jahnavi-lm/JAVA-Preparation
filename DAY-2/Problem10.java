import java.util.*;

class Problem10 {
    public String solution(String str, String[] ban) {
        String strlower = str.toLowerCase();
        String[] words = strlower.split(" ");
        Set<String> banSet = new HashSet<>(Arrays.asList(ban));
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            if (banSet.contains(word)) {
                wordMap.put(word, -1); 
            } else {
                if (!wordMap.containsKey(word)) {
                    wordMap.put(word, 1);
                } else if (wordMap.get(word) != -1) {
                    wordMap.put(word, wordMap.get(word) + 1);
                }     
            }
        }
        String freqWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                freqWord = entry.getKey();
            }
        }
        return freqWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Paragraph:");
        String str = sc.nextLine();
        System.out.println("Enter the number of banned words:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] ban = new String[n];
        System.out.println("Enter the banned words:");
        for (int i = 0; i < n; i++) {
            ban[i] = sc.nextLine();
        }
        Problem10 obj = new Problem10();
        String res = obj.solution(str, ban);
        System.out.println(res);
    }
}
