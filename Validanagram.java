import java.util.*;

//valid anagram , if the two strings are rearrangable and forms the same letter then both the strings are anagram of each other 
//put first string in map and then while we put the next string in the map we reduce it 
//if we do this and obtain a empty string then it is an anagram
//if we get a different character in the second string  then also return false rather then doing all the stuff
//add(char, freq ) of s in the map 
//loop on t 
//check if map.empty


public class Main
{   
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
		String s = "race";
		String t = "carey";
		System.out.println(isAnagram(s , t));
		
	}
}
