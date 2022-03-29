package Q01_Day01;

import java.util.Arrays;

public class Q04_EndingWithY {
    public static void main(String[] args) {
        /*print the word ending with "Y" or 'y'
             make code case insensitive */

         String input="Learn JavaY and earn moneY.";
         input=input.toLowerCase();
         input=input.replaceAll("\\p{Punct}","");

           String arr[]=input.split(" ");

        System.out.println(Arrays.toString(arr));
        String x="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].endsWith("y")){
                x+=arr[i]+" ";
            }
            
        }
        System.out.println(x);


    }}
