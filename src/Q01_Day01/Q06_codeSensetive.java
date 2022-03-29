package Q01_Day01;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_codeSensetive {
    public static void main(String[] args) {
        /*get string from user and type code to find the number of words in a string
        count how many words starts with "a" (make code sensetive)
         */
        String str="  Merhaba guzel dunya Nasilsiniz  ";
        str=str.trim();
        int kelimeSayisi=0;
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        kelimeSayisi=arr.length;
        System.out.println(kelimeSayisi);


        //control
    }//main
}
