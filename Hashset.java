import java.util.*;
public class Main
{   //Hashset is ordered , and dosnt not print null values , random ordering
    //Linked hashset is used to give ordered on based on insertion
    public static boolean isAnagram(String s, String t){
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch  = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for(int i=0;i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){            //checks if the character is present in the keyset of s and if its not a null string
                 if(map.get(ch) == 1){
                     map.remove(ch);
                 }
                 else{
                     map.put(ch, map.get(ch)-1);
                 }
            } else{
                return false;                  //the above code only executes when there is the same character as present in the s set , if not it returns false
            }
        }
        return map.isEmpty(); //if map is not empty then it will return false
    }
    
       public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(5);
		set.add(7);
		set.add(9);
		System.out.println(set);
	    set.remove(2);
		if(set.contains(2)){
		    System.out.println("Set contains");
		}
		
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		
		set.add(2);
		set.add(5);
		set.add(7);
	//how to iterate, through an iterator and an for each loop	
	Iterator it = set.iterator();
	while(it.hasNext()){
	   System.out.println(it.next());
	}
	
	for(String city : cities){
	    System.out.println(city);
	}
	
}
}
