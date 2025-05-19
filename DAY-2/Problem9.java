import java.util.*;

class Problem9{
    public Integer solution(String str){
        str = str.trim();
        int count = 0;

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        Problem9 obj = new Problem9();
        Integer result = obj.solution(str);
        System.out.println(result);

    }
}