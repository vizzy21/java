public class stringop
{
public static void main(String[] args) {
                    //to find the length of the string
                     String z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                     System.out.println("The length of the txt string is: " + z.length());
                    
                     //to change from upper to lowercase
                     String txt = "Hello World";
                     System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
                     System.out.println(txt.toLowerCase());   // Outputs "hello world"

                     //Find index of Character 'Of'
                     String zy = "Please locate where 'locate' occurs!";
                     System.out.println(zy.indexOf("locate")); // op 7

                     //concat
                     String firstName = "John ";
                     String lastName = "Doe";
                     System.out.println(firstName.concat(lastName)); //or use +

                    // to print special characters we need to use \"kjdskjhfs\""
                    String txt = "We are the so-called \"Vikings\" from the north.";
 }
}
