import java.util.*;

class Problem5 {
    public int[] solution(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        rotate(arr, 0, n - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);
        return arr;

    }

    public static void rotate(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        Problem5 obj = new Problem5();
        int[] result = obj.solution(arr, k);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
        
}

