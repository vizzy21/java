public class Rec
{
  public static void printdec (int n)
  {
    if (n == 1)
      {				//have to specify base case
	System.out.print (n);
	return;
      }
    System.out.print (n + " ");
    printdec (n - 1);
  }

  public static void inc (int n)
  {
    //base case
    if (n == 1)
      {				//have to specify base case
	System.out.print (n + " ");
	return;
      }
    inc (n - 1);
    System.out.print (n + " ");
  }

  public static int fac (int n)
  {
    if (n == 0)
      {
	return 1;
      }
    int x = n * fac (n - 1);
    return x;
  }

  public static int naturalnum (int n)
  {

    if (n == 1)
      {				//base case when it gets to 1 we need to just return it to the stack and add it 
	// with the below numbers
	return 1;
      }

    int sum = n + naturalnum (n - 1);
    return sum;
  }

  public static int fibo (int n)
  {
    //0 1 1 2 3 5 8 13 21.....Add consecutive
    //fib nth = fib n-1 + fib n-2
    if (n == 1 || n == 0)
      {
	return n;
      }
    //main function
    int fibb = fibo (n - 1) + fibo (n - 2);
    return fibb;
  }

  public static boolean issorted (int arr[], int i)
  {
    //base case
    if (i == arr.length - 1)
      {
	return true;
      }
    if (arr[i] > arr[i + 1])
      {
	return false;
      }
    return issorted (arr, i + 1);
  }

  public static void printfib (int n)
  {
    //im just going to print the fib series..
    int f = 0, s = 1, t;
    System.out.print (f + " ");
    System.out.print (s + " ");
    for (int i = 2; i < n; i++)
      {
	t = f + s;
	System.out.print (t + " ");
	f = s;
	s = t;
      }
  }

  public static int firstocc (int arr[], int key, int i)
  {				//code to write the first occurance a number occours in an given arr
    if (i == arr.length)
      {
	return -1;
      }

    if (arr[i] == key)
      {
	return i;
      }
    return firstocc (arr, key, i);

  }






  public static void main (String[]args)
  {
    printdec (10);
    System.out.println ();
    inc (10);
    System.out.println ();
    System.out.println (fac (3));
    System.out.print (naturalnum (5));
    System.out.println ();
    System.out.println (fibo (5));
    int arr[] = { 5, 6, 7, 1, 9 };
    System.out.println (issorted (arr, 0));
    printfib (8);
    System.out.println (firstocc (arr, 5, 0));
  }
}
