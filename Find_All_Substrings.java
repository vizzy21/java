//recursion subset and subsequence (string questions) https://www.youtube.com/watch?v=gdifkIwCJyg&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=7
//pass the answer string in funarg
// create a variable in the function body which keeps changing


/*

Subsets
whenerver dealing with permutation and combination
subets are non adjacent collections
[3,5,9]:[3],[3,5],[3,5,9],[5,9]....

this pattern of taking elements and removing them is called the subset pattern
*/

public class Main {
    
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //either add it or ignore it
        subseq(p + ch, up.substring(1));
        subseq(p , up.substring(1));

    }
    
   public static void findsubs(String str, String ans, int i) //i is used a indexx
{   
    //base case:
    if(i==str.length()){
        if(ans.length() == 0){
            System.out.println("null");
        }
            System.out.println(ans);
            return;
        }
    //recursion:
    //yes choice:
    findsubs(str, ans+str.charAt(i), i+1);
    //no
    findsubs(str,ans, i+1);
        
}
   public static void main(String[] args) {
     subseq("","abc");
     String str = "abc";
     findsubs(str,"",0);
    }
}
