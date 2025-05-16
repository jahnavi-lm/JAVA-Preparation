import java.util.*;
class Problem7{
    public int solution(int arr[]){
        int currentSum = arr[0];
        int maxsum = arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxsum = Math.max(maxsum, currentSum);
        }
        return maxsum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of the array");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Problem7 obj = new Problem7();
        int result = obj.solution(arr);
        System.out.println(result);
        sc.close();
    }  

}