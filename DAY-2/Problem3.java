import java.util.*;

class Problem3{
    public boolean solution(String str){
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(ch == '(' && ch != ')' ||
                ch == '{' && ch != '}' ||
                ch == '[' && ch != ']'){
                    return false;
                }
            }   
        }
        return st.isEmpty();
    }       
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        Problem3 obj = new Problem3();
        Boolean result = obj.solution(str);
        System.out.println(result);


    }
}