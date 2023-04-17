/*stacks
explicit stack :  recursion and backtacking la used
books, carrom and coins, stone stacked on top of each 
push, pop and peek, isempty operations 0(1) for all three [lifo]
types of stack datastructurs is array, arraylist and linked list
peek is sending back the last index element, ie the element on top
*/
import java.util.ArrayList;

public class Main
{  
static class Stack{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isempty(){
        return list.size() == 0;    //if no elements are present in the list then true will be returned or else false
    }
    //push
    public static void push(int data){
        list.add(data); //adds data in the last index
    }
    public static int pop(){  // why int datatype, we need to store it before we return it
        if(isempty()){
            return -1; //represents that the stack is empty
        }
        
        int top = list.get(list.size()-1);   //gets the value and stores it in top
        list.remove(list.size() - 1);        //removes the top element
        return top;
    } 
    public static int peek(){
        return list.get(list.size()-1);  
    }
}

public static void main(String[] args) {
	    Stack s = new Stack();           //stack is a class , so u always need to create a object before doing any functions
	    s.push(1);s.push(2);s.push(3);
	    while(!s.isempty()) {            //printing stack
	        System.out.println(s.peek());
	        s.pop();
	    }
	    
	    
	}
}
