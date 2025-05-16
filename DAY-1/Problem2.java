import java.util.*;

class Problem2{
    public List<List<Integer>> solution(int arr[]){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int narr[] = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        result.add(Arrays.asList(arr[i], arr[j], arr[k]));                    
                    }
               }
            }
        }
            return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of the array");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Problem2 obj = new Problem2();
        List<List<Integer>> result = obj.solution(arr);
        System.out.println(result);
        sc.close();
    }
}