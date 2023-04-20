import java.util.Stack;  
public class Main
{  
   public static void pushAtbottom(Stack<Integer> s, int data){
      if(s.isEmpty()){
          s.push(data);
          return;
      }
       int top = s.pop();
       pushAtbottom(s, data);
       s.push(top);
   }
   //it removes element at top, and then calls it back with the removed element Stack
   //
    
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();  //removing characters from s and putting it in char curr
            sb.append(curr);      // appending it in the new resultant sb
        }
        
        return sb.toString();
    }
    
    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
    public static void reversestack(Stack<Integer> s){
       if(s.isEmpty()){
           return;
       }
       
        int top = s.pop();
        reversestack(s);
        pushAtbottom(s, top);
    }
    
public static void main(String[] args)   
{
Stack<Integer> st = new Stack<>();
st.push(1);
st.push(2);
System.out.println(st);  //prints in the form of list


/* push at the bottom of the Stack*/
Stack<Integer> stk= new Stack<>();  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120); 
pushAtbottom(stk, 4);
while(!stk.isEmpty()){
    System.out.println(stk.pop()); //prints in the form of stack
}

//reverse a string using a stack

String str = "abc";
String result  = reverse(str);
System.out.println(result);

//reverse a stack
Stack<Integer> stko= new Stack<>();  
stko.push(78);  
stko.push(113);  
stko.push(90);  
stko.push(120); 
printstack(stko);
reversestack(stko);
printstack(stko);


}


}  

