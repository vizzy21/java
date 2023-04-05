//array list have a dynamic size and primtive datatypes cannot be stored directly
import java.util.ArrayList;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2); //time complexity needed is 0(1)
        list.add(2,20);	 //0(n)
		
		//get StackTraceElement
		int element =  list.get(0);
		System.out.println(element);
		
	    //Delete element
	    int lol = list.remove(1);
	    System.out.println(lol);
	    
	    //set element
	    list.set(1,20); //index 1 gets 20 stored
	    System.out.println(list);
	    
	    //contains element
	    System.out.println(list.contains(1));
             
        //list.size()
        System.out.println(list.size());
        
        //print the ArrayList
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
        
        //print reverse of an ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        for(int i = list1.size()-1;i>=0;i--){
        System.out.println(list1.get(i) + " ");
        }
      System.out.println();
      
      
        //print max in an ArrayList
         ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
        list2.add(9);
        list2.add(4);
        list2.add(5);
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list2.size(); i++){
            if(max<list2.get(i)){
                max = list2.get(i);
            }
        }
        //to write it without the if
        //max= Math.max(max, list.get())
        System.out.println("max element:" + max);
        
        //Swap two numbers using an ArrayList #not understd 
        
	}
	
}
