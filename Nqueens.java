//place n queens on an nn chessboard such that no 2 queens can attack each other
//question that can be asked 
// find all solutions, count all the solutions, find if the solution is possible or not=
//if it is n then the possible solutions are nn
//check left diag, right diag, and vertically, if there exist a queen then cant be placed

public class Nqueens
{
   public static boolean issafe(char board[][], int row, int col) {
       //vertical up-// same colm, row-1
       for(int i = row-1;i>=0;i--){
           if(board[i][col] == 'Q'){ //as column is same we use col
               return false;
           }
       }
       //diagnal left- (i-1,j-1) to go up diagonal

       for(int i = row-1, j = col-1; i >= 0 && j >=0; i--, j--){
           if(board[i][j] == 'Q'){
               return false;
           }
       }
       //diagnal right- (i+1,j-1)
       for(int i = row-1, j = col+1; i >= 0 && j<board.length; i--, j--){
            if(board[i][j] == 'Q'){
               return false;
           }
       }
       return true;
   }

  public static void nQueens (char board[][], int row)
  {
    //base case
    if (row == board.length)
      {
    printboard (board);
      }
    //recursion
    for (int j = 0; j < board.length; j++)
      {
    if (issafe(board, row, j))
      {
        board[row][j] = 'Q';
        nQueens (board, row + 1);
        board[row][j] = 'x';
      }
      }
  }

  public static void printboard (char board[][])
  {
    System.out.println ("__chessboard__");
    for (int i = 0; i < board.length; i++)
      {
    for (int j = 0; j < board.length; j++)
      {
        System.out.print (board[i][j] + " ");
      }
    System.out.println ();
      }
  }


  public static void main (String[]args)
  {
    int n = 4;
    char board[][] = new char[n][n];
    for (int i = 0; i < n; i++)
      {
    for (int j = 0; j < n; j++)
      {
        board[i][j] = 'x';
      }
      }
    nQueens (board, 0);
  }
}
