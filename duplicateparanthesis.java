import java.util.Stack;

public class Main {
    public static boolean validParanthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '{' && ch == '}') ||
                        (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean dupParanthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {                       //closing condition
                int count = 0;
                while (s.peek() != '(') {          //this will run until s.peek is not matching
                    s.pop();
                    count++;
                }
                if (count == 0) {
                    return true;                 //duplicate exists
                } else {                           //remove the opening pair
                    s.pop();
                } 
            } else {                             //opening condition
                s.push(ch);   
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        String ch = "(){}[]"; // true case
        System.out.println(validParanthesis(ch));
        String bh = "((a+b) + (c+d))";
        String chh = "((a+B))";
        System.out.println(dupParanthesis(bh));
        System.out.println(dupParanthesis(chh));

    }
}
