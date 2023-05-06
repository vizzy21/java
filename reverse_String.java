 public static String reverseWord(String str)
    {
       /* StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString(); */
        
        //using char array
        char[] chararray = str.toCharArray();
        int left = 0; int right = chararray.length - 1;
        while(left<right){
            char temp = chararray[left];
            chararray[left] = chararray[right];
            chararray[right] = temp;
            left++;
            right--;
            }
         return new String(chararray);
    }
}
