import java.util.*;

class Problem1 {

    public int[] solution(int num[], int target) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{num[i], num[j]};
                }
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the values of the array");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        Problem1 obj = new Problem1();
        int result[] = obj.solution(num, target);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
