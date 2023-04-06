//containing thw most water , heights will be given and we nedd
//to find which height and width we should take to produce the mac output area

//height is found by the shortrest line between two lines 
//width is found by subtracting the index

//global variable max value
//height = min(l1,l2)
//width = j-i
//height * width = area, always compare with max

import java.util.ArrayList;
import java.util.*;
public class Main

{
   public static int store_Water(ArrayList<Integer> height){
       int maxWater = 0;
       //brute
       for(int i=0;i<height.size();i++){
           for(int j=i+1;j<height.size();j++){
               int ht = Math.min(height.get(i),height.get(j));
               int wd = j-i;
               int currwater = ht*wd;
               maxWater = Math.max(maxWater, currwater);//which ever is max will now be stored in max water
           }
       }
       return maxWater;
   } 

   //two pointer approach - 0(n)
   public static int store_water2(ArrayList<Integer> height){
       int maxWater = 0;
       int lp = 0;
       int rp = height.size()-1;
       
       while(lp<rp) //unless lp and right p dosnt implements
       {
           //calculate the area of water (same logic as brute force)
           int ht = Math.min(height.get(lp), height.get(rp));
           int wd = rp-lp;
           int currwater = ht*wd;
           maxWater = Math.max(maxWater, currwater);
          
           //update
           if(height.get(lp) < height.get(rp)){
               lp++;
           }
           else{
               rp--;
           }
       }
       return maxWater;
    }
  
   public static void main(String[] args) {
	ArrayList<Integer> height =  new ArrayList<>();
	height.add(1);
	height.add(8);
	height.add(6);
	height.add(2); 
	height.add(5);
	height.add(4);
	height.add(8);
	height.add(3);
	height.add(7);
	System.out.println(store_Water(height));
	System.out.println(store_water2(height));

    }
}
