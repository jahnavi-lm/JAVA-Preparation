import java.util.*;

class Problem7{
    public String solution(String[] str){
        if(str.length == 0){
            return "";
        }
        for(int i=0;i<str[0].length();i++){
            char ch = str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(i>str[j].length() || str[j].charAt(i) !=ch){
                    return str[0].substring(0,i);
                }
            }
        }
        return str[0];  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of words");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0;i<n;i++){
            str[i] = sc.next();
        }
        Problem7 obj = new Problem7();
        String result = obj.solution(str);
        System.out.println(result);
    }
}