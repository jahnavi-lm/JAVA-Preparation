import java.util.*;
class Problem3 {
    public List<Integer> solution(int arr[]){
        int n = arr.length;
        List<Integer> zeroarr = new ArrayList<>();
        List<Integer> nonzeroarr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if (arr[i]== 0){
                zeroarr.add(arr[i]); 

            }
            else{
                nonzeroarr.add(arr[i]);
            }
        }
        result.addAll(nonzeroarr);
        result.addAll(zeroarr);
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
        Problem3 obj = new Problem3();
        List<Integer> result = obj.solution(arr);
        System.out.println(result);
        sc.close();
    }
    
}