public class foreach
{
	public static void main(String[] args) 
           {   int i = 0;
               int[] a = {5,2,2,0};
               for(int x: a){
                   System.out.println(x + " " + i++);
                   
               }
           }
}
/*
5 0
2 1
2 2
0 3
