import java.io.*;
 
class Main {
 
    public static void main(String args[])
    {
        int x = 2000;
        int y = 1;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);
    }
}
