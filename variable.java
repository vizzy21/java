public class variable
{
	public static void main(String[] args) {
	    final int v = 30;
	    int x = 50;
	    int y = 50;
	    int z = 50;
	    float k = 30.422f;
	    String ch = "vizz"; // string is a non primitive data type so it should start with uppercase
	    //if it starts with lowercase then it is primitive
		System.out.println("Hello World");
	//	System.out.print("Hello World! ");
        System.out.println("I will print on the same line.");
        System.out.println(k);
        System.out.println(x+y+z);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(ch);
	}
}
