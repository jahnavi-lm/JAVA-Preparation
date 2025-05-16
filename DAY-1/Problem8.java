import java.util.*;

class Problem8{
    public int solution(int arr[]){
        int maxproduct = arr[0];
        int currentprod = arr[0];
        for(int i=1;i<arr.length;i++){
            currentprod = Math.max(arr[i], currentprod * arr[i]);
            maxproduct = Math.max(currentprod,maxproduct);
        }
        return maxproduct;
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
        Problem8 obj = new Problem8();
        int result = obj.solution(arr);
        System.out.println(result);
        sc.close();
    } 
}