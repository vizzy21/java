//recursion subset and subsequence (string questions) https://www.youtube.com/watch?v=gdifkIwCJyg&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=7
//pass the answer string in funarg
// create a variable in the function body which keeps changing

public class Main {
    
    /*
    Question 1:
    In this methord we pass two string processed and unprocessed, this function is used to skip all the a in the string*/
    static void skip(String p, String up){ 
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        if(ch == 'a') {
            skip(p, up.substring(1));             //if its a then u dont need to add it in the array , you can just skip to the next letter in the string
        } else {
            skip(p+ch, up.substring(1));         //the upstring methord is used to remove the strings first character, this is used here to move past to the next character
        }
    }

    /*this methord is used to return a string, instead of printing it directly in the
    function, we use return methords in this case to the function and when its fully 
    finished the whole thing is returned to the main function*/
   
    static String skip2(String up){ 
        if(up.isEmpty()){
            return"";
        }
        
        char ch = up.charAt(0);
        if(ch == 'a') {
            return  skip2( up.substring(1));             //if its a then u dont need to add it in the array , you can just skip to the next letter in the string
        } else {
           return ch + skip2( up.substring(1));         //the upstring methord is used to remove the strings first character, this is used here to move past to the next character
        }
    }
   
    //Incase we need to skip a string or a word in a given string , we dont need to read it charcter by character so we can remove that LinkageError
    static String skipapple(String up){ 
        if(up.isEmpty()){
            return"";
        }
        
        //incase if its like it should start with app and not end with apple then the if Condn-
        //if(up.startsWith("app")&&!up.startsWith("apple"))
        if(up.startsWith("apple")) {
            return  skipapple( up.substring(5));   //skips 5 letters if it is apple             //if its a then u dont need to add it in the array , you can just skip to the next letter in the string
        } else {                                           //will be used to skip in simple words
           return up.charAt(0) + skipapple( up.substring(1));         //the upstring methord is used to remove the strings first character, this is used here to move past to the next character
        } //incase apple illana it adds the character and then the next recursive call
    }
    
    public static void main(String[] args) {
       skip("","baccadhahh");
       System.out.println(skip2("baccadhahh"));
       System.out.println(skipapple("baccadhaapplehh"));
    }
}
