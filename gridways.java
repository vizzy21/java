//grid ways
//no of ways to reach to n-1,m-1, the last cell in a grid
//we can only traverse in the directions right and down
//as a reason the recursive function is f(x,y) = f(x+1,y) + f(x,y+1)


public class Main
{   //this takes exponential time construct to make it more eff use string permutation of right and down 
    public static int gridways(int i, int j, int n, int m){
    //base case :
    if(i==n-1 && j==n-1){ //cond on reaching the last cell
        return 1;
    }
    else if(i == n|| j==n){ // if it reaches the end row or end of colm, boundry criss cind
        return 0;
    }   
    int w1 = gridways(i+1,j,n,m);
    int w2 = gridways(i,j+1,n,m);
    return w1+w2;}
	
	public static void main(String[] args) 
	{
	int m = 3, n = 3;
	System.out.println(	gridways(0,0,n,m) + " ways to reach the end target" ); // i and j are the starting indexes
	} 
}

/*class GfG {
 
    // function that will
    // calculate the factorial
    static long factorial(int N)
    {
        int result = 1;
        while (N > 0) {
            result = result * N;
            N--;
        }
        return result;
    }
 
    static long countWays(int N)
    {
        long total = factorial(N + N);
        long total1 = factorial(N);
        return (total / total1) / total1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int N = 5;
        System.out.println("Ways = " + countWays(N));
    }
}*/
