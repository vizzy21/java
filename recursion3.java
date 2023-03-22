import java.util.*;
import java.util.ArrayList;
public class Main
{

  //find sorted array through recursion 
  static boolean sorted (int[]arr, int index)
  {
    if (index == arr.length - 1)
      {
	return true;
      }
    return arr[index] < arr[index + 1] && sorted (arr, index + 1);
  }

  static boolean linear (int[]arr, int target, int index)
  {
    if (index == arr.length)
      {
	return false;
      }
    return arr[index] == target || linear (arr, target, index + 1);
  }

 static int findindex(int[]arr, int target, int index)
{
    if (index == arr.length)
    {
        return -1;
    }
    if (arr[index] == target) {
        return index;
    } else {
        return findindex(arr, target, index+1);
    }
}

static ArrayList<Integer> list = new ArrayList<>();

static int findallindex(int[]arr, int target, int index)
{
    if (index == arr.length)
    {
        return -1;
    }
    if (arr[index] == target) {
        list.add(index);
    }  
  return  findallindex(arr, target, index+1);
   
}

 public static void main (String[]args)
 {  
    int[] array = { 3, 4, 5, 23, 40 };
	System.out.println (sorted (array, 0));
 	int[] arr = { 3, 4, 5, 23, 40 };
    System.out.println (linear (arr, 40, 0));
    System.out.println (findindex (arr, 40, 0));
     int[] arre = { 3,4, 4, 5, 23, 40 };
     findallindex(arre,4,0);
     System.out.println(list); 
     
 }

    
    }
