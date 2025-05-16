import java.util.*;

class Problem5 {
    public int[] solution(int arr[]){
        int n= arr.length;
        int[] result = new int[n];
        for(int i = 0;i<n;i++){
            int product =1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    product = product * arr[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Problem5 obj = new Problem5();
        int[] result = obj.solution(arr);
        System.out.println(Arrays.toString(result));       
    }
}