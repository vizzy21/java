public class permutations {
    
    // The method should be static as it is being called from the static main method.
    // Also, it should take two String parameters and return void.
    public static void perm(String s, String ans) {
        
        // base case:
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        // recursion
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            // remove the curr character from the string string
            // to remove a character, use substring method
            String ns = s.substring(0, i) + s.substring(i+1);
            // adds the curr char to ans string
            perm(ns, ans+curr);
        }
    }
    
    public static void main(String[] args) {
        String ch = "abc";
        perm(ch, "");
    }
}
