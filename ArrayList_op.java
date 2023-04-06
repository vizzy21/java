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
	
	//sorting (collections)
	        ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(19);
		list.add(1);
		list.add(5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//descending
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
                //Multidimensional array list
		ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);list1.add(2);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);list2.add(4); // Changed to list2
        mainlist.add(list2);

        //how to traverse it
        for(int i = 0;i<mainlist.size();i++){
          ArrayList<Integer> currlist = mainlist.get(i);
           for(int j = 0;j<currlist.size();j++){
             System.out.print(currlist.get(j)+ " ");
        }
    System.out.println(); // Moved outside the inner loop
    }

   System.out.println(mainlist);
   
   
   //with the help of Multidimensional arraylist making tables for 1,2,4
   	ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        
        for(int i=1;i<=5;i++){
            list3.add(i*1); //1 2 3 4 5-
            list4.add(i*2); 
            list5.add(i*4); }
    
     Mainlist.add(list3);
     Mainlist.add(list4);
     Mainlist.add(list5);

     //System.out.println(Mainlist);
     
    //  using for loops for traversal
    for(int i = 0;i<Mainlist.size();i++){
          ArrayList<Integer> currlist1 = Mainlist.get(i);
           for(int j = 0;j<currlist1.size();j++){
             System.out.print(currlist1.get(j)+ " ");
        }
    System.out.println(); // Moved outside the inner loop
    }
	}
	
}
