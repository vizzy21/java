import java.util.HashMap;
import java.util.Map;
public class Main
{   
    //How to reverse a string
    public static void stringrev(String str){
    
        //approch 1
		char[] arr = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
		    System.out.print(arr[i]);
		}
		System.out.println();
	    //approch2
	     for(int i = str.length()-1;i>=0;i--){
	    System.out.print(str.charAt(i));
	    }
	    System.out.println();
	    //appr3
	    StringBuilder sb = new StringBuilder(str);
	    System.out.println(sb.reverse());
		}
	
	//How to remove duplicate characters in a given String
    public static void removedupchar(String str){
	    //index methord
	    StringBuilder sb = new StringBuilder();
	    for(int i=0;i<str.length();i++){
	        char ch = str.charAt(i);
	        int idx = str.indexOf(ch,i+1); //which char u wanna search and which index u wanna search from
	            if(idx == -1){
	                sb.append(ch);
	            }
	    }
	    System.out.println(sb);
	    
	    //approach approch2
	    	char[] arr = str.toCharArray();
	    	StringBuilder sb3 = new StringBuilder();
	    	for(int i=0;i<arr.length;i++){
	    	    boolean rep = false;
	    	    for(int j = i+1;j<arr.length;j++){
	    	        if(arr[i] == arr[j]){
	    	            rep = true;
	    	            break;
	    	        }
	    	    }
	    	    if(!rep){
	    	        sb3.append(arr[i]);
	    	    }
	    	}
	    	System.out.println(sb3);
	}

    //reverse each and every word of a given String
    public static void revword(String input){
       String[] words = input.split(" ");
       String output ="";
         for(String word: words){
                                           //logic to reverse each word 
        String revword = ""; 
        for(int i = word.length()-1; i>=0; i--){
            revword += word.charAt(i); //adding characcters from last to an emptystring
        } 
        output += revword +" "; 
    }
    System.out.println(output + " ");
    }
    
    //word occourance in a given String
    public static void occ(String input){
        //containskey(key),get(key),map.put(ch,1) are the methords
        Map<Character, Integer> map = new HashMap();
        char[] chars = input.toCharArray();
        for(char ch : chars){
            if(!map.containsKey(ch)){
                map.put(ch , 1);
            }else{
               int val= map.get(ch);
               map.put(ch ,val+ 1);
            }
        }
        System.out.println(map);
    }
    
    
    public static void main(String[] args) {
		String str = "hello";
		stringrev(str);
	    removedupchar(str);
		revword("hey bitch");
		occ("hahahahahahahhahhahahahahahahahaahahhahahdhdhhd");
	}
}
