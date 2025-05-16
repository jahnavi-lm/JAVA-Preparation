import java.util.*;
class Problem4{
    public List<Integer> solution(int arr1[], int arr2[]){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }  
        for (int i = 0; i < arr2.length; i++){
            if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0){
                result.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
               }
            }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the values of the first array");
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the values of the second array");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }
        Problem4 obj = new Problem4();
        List<Integer> result = obj.solution(arr1, arr2);
        System.out.println(result);
        sc.close();
    }
}